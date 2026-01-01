package BinaryTrees;

public class SumofNode {
    static class Node{
        int data;
        Node left;
        Node right;

        //constructore
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sumOfNode(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = sumOfNode(root.left);
        int rightCount = sumOfNode(root.right);
        int totalcount = leftCount + rightCount + root.data;
        return totalcount;
    }
    public static void main(String[] args) {
             /*
 
                 1
                / \
               2   3
              / \  / \     
             4   5 6  7   
 
 */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right =  new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right = new Node(6);
        root.right.right = new Node(7);
        System.out.println(sumOfNode(root));
    }
}
