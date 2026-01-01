package Test;

public class BinaryTree{
 
    static class Node{
        int data;
        Node left;
        Node right;
  
          Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
          }
    }
      
    static class innerBinaryTree {
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

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
           System.out.print(root.data + " ");
           preOrder(root.left);
           preOrder(root.left);
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
}

    public static void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");


    }

   public static void main(String[] args) {
    int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    innerBinaryTree tree = new innerBinaryTree();
    Node root = tree.buildTree(node);
    // System.out.println(root.data); // 1
    // preOrder(root);
    // inOrder(root);
    postOrder(root);
}

}