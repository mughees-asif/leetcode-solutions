package com.mughees;

class TreeNode {
    TreeNode root;
    private int data;
    private TreeNode left, right;

    private TreeNode() {
    }

    private TreeNode(int data) {
        this.data = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

//    private static int maxPathSum(TreeNode root) {
//        int result = Integer.MIN_VALUE;
//        solve(root, result);
//        return result;
//    }
//
//    private static int solve(TreeNode root,int result) {
//        if(root == null) {
//            return 0;
//        }
//        int L = solve(root, );
//    }

    private static int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Height of tree is : " +
                tree.height(tree.root));
    }
}