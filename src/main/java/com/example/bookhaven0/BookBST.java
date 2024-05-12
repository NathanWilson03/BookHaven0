package com.example.bookhaven0;

class BookBST {
    // Node class for BST
    private static class TreeNode {
        String title;
        TreeNode left;
        TreeNode right;

        TreeNode(String title) {
            this.title = title;
            left = null;
            right = null;
        }
    }

    private TreeNode root;

    // Constructor
    public BookBST() {
        root = null;
    }

    // Method to insert a book title into the BST
    public void insert(String title) {
        root = insertRecursive(root, title);
    }

    private TreeNode insertRecursive(TreeNode root, String title) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new TreeNode(title);
            return root;
        }

        // Otherwise, recur down the tree
        if (title.compareTo(root.title) < 0) {
            root.left = insertRecursive(root.left, title);
        } else if (title.compareTo(root.title) > 0) {
            root.right = insertRecursive(root.right, title);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    // Method to search for a book title in the BST
    public boolean search(String title) {
        return searchRecursive(root, title);
    }

    private boolean searchRecursive(TreeNode root, String title) {
        // Base Cases: root is null or title is present at root
        if (root == null || root.title.equals(title))
            return root != null;

        // Title is greater than root's title
        if (title.compareTo(root.title) > 0)
            return searchRecursive(root.right, title);

        // Title is smaller than root's title
        return searchRecursive(root.left, title);
    }

    // Method to delete a book title from the BST
    public void delete(String title) {
        root = deleteRecursive(root, title);
    }

    private TreeNode deleteRecursive(TreeNode root, String title) {
        // Base Case: If the tree is empty
        if (root == null)
            return root;

        // Recur down the tree
        if (title.compareTo(root.title) < 0)
            root.left = deleteRecursive(root.left, title);
        else if (title.compareTo(root.title) > 0)
            root.right = deleteRecursive(root.right, title);
        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.title = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRecursive(root.right, root.title);
        }

        return root;
    }

    // Method to find the minimum value in the BST
    private String minValue(TreeNode root) {
        String minv = root.title;
        while (root.left != null) {
            minv = root.left.title;
            root = root.left;
        }
        return minv;
    }
}
