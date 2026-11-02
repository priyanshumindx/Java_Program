import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BT {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(3);
        root.right.right = new Node(7);

        System.out.println("Tree Traversal Output:");

        // Iterative In-order traversal using a Stack instead of a function
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost Node of the current Node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Current must be null at this point
            current = stack.pop();

            // Print the node data
            System.out.println(current.data);

            // We have visited the node and its left subtree. Now, it's the right subtree's turn
            current = current.right;
        }
    }
}
