package com.leetcode.tree;

public class RunExample {
    public static void main(String[] args) {
        System.out.println("Hello, LeetCode Tree Examples!");

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        /*BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        System.out.println("Binary Level Order Traversal:");
        System.out.println(solution.levelOrder(root));*/

        BinaryTreeZigzagLevelOrderTraversal zigzagSolution = new BinaryTreeZigzagLevelOrderTraversal();
        System.out.println("Binary Zigzag Level Order Traversal:");
        System.out.println(zigzagSolution.zigzagLevelOrder(root));
    }
}
