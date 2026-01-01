package Test;

public class SearchBST {

    // Node structure
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Insert a node into BST
    public static Node insertBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insertBST(root.left, val);
        } else {
            root.right = insertBST(root.right, val);
        }

        return root;
    }

    // Search an element in BST (Recursive)
    public static boolean searchBST(Node root, int key) {
        // Base case
        if (root == null) {
            return false;
        }

        // Key found
        if (root.data == key) {
            return true;
        }

        // Search left subtree
        if (key < root.data) {
            return searchBST(root.left, key);
        }
        // Search right subtree
        else {
            return searchBST(root.right, key);
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] values = {5, 1, 3, 4, 2, 6};

        Node root = null;

        // Build BST
        for (int val : values) {
            root = insertBST(root, val);
        }

        int key = 4;

        System.out.println("Is key present? " + searchBST(root, key));
    }
}
