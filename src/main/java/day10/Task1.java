package day10;

//not right
public class Task1 {
    public static void main(String[] args) {
        Node root = new Node(20);
        addNode(14, root);
        addNode(11, root);
        addNode(16, root);
        addNode(5, root);
        addNode(8, root);
        addNode(15, root);
        addNode(18, root);
        addNode(23, root);
        addNode(22, root);
        addNode(27, root);
        addNode(24, root);
        addNode(150, root);

        printTree(root);

    }

    public static void printTree(Node root) {
        if(root.left != null) {
            printTree(root.left);
        }
        if(root.right != null) {
            printTree(root.right);
        }

        System.out.println(root.value);
    }



    public static void addNode(int value, Node root) {
        if(value < root.value) {
            if(root.left == null) {
                root.left = new Node(value);
                return;
            }
            addNode(value, root.left);
        }

        if(value > root.value) {
            if(root.right == null) {
                root.right = new Node(value);
                return;
            }
            addNode(value, root.right);
        }
    }

}
