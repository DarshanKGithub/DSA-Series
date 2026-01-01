package Test;

public class HightBinaryTree {
     public static class Node{
        int data;
        Node left;
        Node right;

         Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
         }
     }
 
       public static class BinaryTree{
          static int idx = -1;
          public static Node buildTree(int[] node){
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

       public static int  heightOfTree(Node root){
        if(root == null){
            return 0;
        }

        int lf = heightOfTree(root.left);
        int rh = heightOfTree(root.right);
        int total = Math.max(lf, rh) + 1;

        return total;
       }


    public static void main(String[] args) {
    int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    //  Node root = new Node(1);
    //  root.left = new Node(2);
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(node);
    // System.out.println(root.data);
    System.out.println(heightOfTree(root));
 

         
    }
}
