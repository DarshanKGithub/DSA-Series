package Test;

public class CountLeafNodes {
   
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

       public static int  countLeaf(Node root){
             if(root == null){
                return 0;
             }

             int left = countLeaf(root.left);
             int right = countLeaf(root.right);
             return left + right + 1;
       }


    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        // System.out.println(root.data);
        System.out.println(countLeaf(root));
        

    }
}
