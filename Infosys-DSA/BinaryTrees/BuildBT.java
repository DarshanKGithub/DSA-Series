package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BuildBT {
 
    //Structure of Node
    static class Node{
        int data;//Value in nodes
        Node left; // parent left child
        Node right; //parent right child

        //Constructor
        Node(int data){
            this.data = data;
            this.left = null; // Starting point pai null hai abhi
            this.right = null; // Starting point pai null hai abhi
        }
    }

    //Design Binary Tree
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int node[]){
           idx++;
           if(node[idx] == -1){
            return null;
           }

           Node newNode = new Node(node[idx]);
           newNode.left = buildTree(node);
           newNode.right = buildTree(node);

           return newNode;
        }
        }

        //Preorder Traversel
        //Rules:
        //1.root
        //2.leftsubstree
        //3.right subtree
        public static void preorder(Node root){
            //Base case
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        //Inorder traversel
        //Rule:
        //1.leftsubstree
        //2.root
        //3.right subtree
        public static void inorder(Node root){
             //Base case
             if(root == null){
                return;
             }

             inorder(root.left);
             System.out.print(root.data + " ");
             inorder(root.right);
        }

        //Postorder traversal
        //Rule
         //1.leftsubstree
        //2.right subtree
        //3.root
        public static void postorder(Node root){
            if(root == null){
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");

        }

        //Levelorder traversel
        public static void levelOrderTraversel(Node root){
            //Base Case
            if(root == null){
                return;
            }

            //Queue FIFO(First In First Out)
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // preorder(root);
        // inorder(root);
        // postorder(root);
        levelOrderTraversel(root);
    }
}
