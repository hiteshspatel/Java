public class BinaryTree {
     Node root;

     public BinaryTree(){
         root =null;
     }

     void printInOrder(Node node)
     {
         if (node == null)
         {
             return; //break condition for recursive call
         }

         printInOrder(node.left); //left subtree
         System.out.print(node.data + " "); //root
         printInOrder(node.right); //right subtree
     }

    void printPreOrder(Node node)
    {
        if (node == null)
        {
            return; //break condition for recursive call
        }

        System.out.print(node.data + " "); //root
        printPreOrder(node.left); //left subtree
        printPreOrder(node.right); //right subtree
    }

    void printPostOrder(Node node)
    {
        if (node == null)
        {
            return; //break condition for recursive call
        }

        printPostOrder(node.left); //left subtree
        printPostOrder(node.right); //right subtree
        System.out.print(node.data + " "); //root
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreOrder(tree.root);

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInOrder(tree.root);

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostOrder(tree.root);

    }

}
