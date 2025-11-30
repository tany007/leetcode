package com.leetcode.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> output = new ArrayList<>();

        if(root == null) {
            return output;
        }

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            int size = nodeQueue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i=0;i<size;i++) {
                TreeNode node = nodeQueue.poll();
                currentLevel.add(node.val);

                if(node.left != null) {
                    nodeQueue.add(node.left);
                }
                if(node.right != null) {
                    nodeQueue.add(node.right);
                }
            }
            output.add(currentLevel);
        }
        return output;
    }
}
