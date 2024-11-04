package Lab06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree<E extends Comparable<E>> {
    private class Node {
        public E  data;
        public Node left;
        public Node right;
    }
    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }
    public boolean contains(E element){
        Node current = root;
        while (current != null) {
            int comparison = element.compareTo(current.data);
            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }
    public void insert(E element){
        Node newNode = new Node();
        newNode.data = element;
        newNode.left = null;
        newNode.right = null;
        if (root == null)
            root = newNode;
        else insertSub(newNode, root);
    }

    private void insertSub(Node newNode, Node node) {
        int result = newNode.data.compareTo(node.data);
        // duplicates go to the right
        if (result >= 0) {
            //go right
            if (node.right == null) {
                node.right = newNode;
            } else {
                insertSub(newNode, node.right);
            }
        } else {
            // go left
            if (node.left == null) {
                node.left = newNode;
            } else {
                insertSub(newNode, node.left);
            }
        }
    }

    public void print(){
        if (root != null)
            printSub(root);
    }

    private void printSub(Node node) {
        //inorder traversal
        if (node != null){
            printSub(node.left);
            System.out.println(node.data);
            printSub(node.right);
        }
    }
    private void printSubPostorder(Node node) {
        if (node != null) {
            printSubPostorder(node.left);   // Traverse the left subtree
            printSubPostorder(node.right);  // Traverse the right subtree
            System.out.println(node.data);   // Visit the current node
        }
    }
    private void printSubPreorder(Node node) {
        if (node != null) {
            System.out.println(node.data); // Visit the current node
            printSubPreorder(node.left);    // Traverse the left subtree
            printSubPreorder(node.right);   // Traverse the right subtree
        }
    }

    public void insertIterative(E element){
        Node newNode = new Node();
        newNode.data = element;
        if (root == null){
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (element.compareTo(current.data) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (element.compareTo(parent.data) < 0) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }
    public void inorderTraversal() {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                System.out.println(current.data);
                current = current.right;
            }
        }
    }

    public void breadthFirstTraversal() {
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.println(current.data);

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
}
