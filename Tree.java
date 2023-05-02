class Node {
    Node right;
    Node left;
    private int data;
    
    Node() {

    }

    Node(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

}

public class Tree {
    Node root;


    public void addNode(Node node, int data) {
        if (node == null) {
            this.root = new Node(data);
            return;
        }
            
        Node newNode = new Node(data);
        if (data < node.getData()) {
            if (node.left == null) {
                node.left = newNode;
            } else if (node.left != null)
                addNode(node.left, data);
        } else if(data > node.getData()){
            if (node.right == null)
                node.right = newNode;
            else if(node.right != null) {
                addNode(node.right, data);
            }
        }
    }

    public void addNode(int data) {
        this.addNode(this.root, data);
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.getData() + "  ");
            inOrder(node.right);
        } 
    }

    public void printInOrder() {
        if(this.root == null) {
            System.out.println("belum ada node brooo");
            return;
        }
        this.inOrder(root);
    }
}