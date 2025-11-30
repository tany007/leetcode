package com.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> output = new ArrayList<>();

        if(root == null) {
            return output;
        }

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        boolean flag = true;

        while(!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = nodeQueue.poll();

                if (currentNode.left != null) {
                    nodeQueue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    nodeQueue.add(currentNode.right);
                }

                if (flag) {
                    currentLevel.add(currentNode.val);
                }
                else {
                    currentLevel.add(0, currentNode.val);
                }
            }
            output.add(currentLevel);
            flag = !flag;
        }
        return output;
    }
}
