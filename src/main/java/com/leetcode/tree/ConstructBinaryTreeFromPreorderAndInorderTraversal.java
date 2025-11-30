package com.leetcode.tree;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    /*public TreeNode buildTree(int[] preorder, int[] inorder) {

        int preIndex = 0;
        int inIndex = 0;

        if(preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex]);

        int rootIndex = 0;
        for(int i=0;i<inorder.length;i++) {
            if(inorder[i] == root.val) {
                rootIndex = i;
                break;
            }
        }

        root.left = buildTree(preorder, inorder);
        root.right = buildTree(preorder, inorder);

        return root;
    }*/

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int lengthP = preorder.length;
        int lengthI = inorder.length;
        int i = 0;
        TreeNode root = null;

        if(lengthP == 0 && lengthI == 0) {
            return root;
        }

        root = new TreeNode(preorder[i]);

        int rootIndex = 0;
        for(int j=0;j<lengthI;j++) {
            if(inorder[j] == root.val) {
                rootIndex = j;
                break;
            }
        }
        return null;
    }
}
