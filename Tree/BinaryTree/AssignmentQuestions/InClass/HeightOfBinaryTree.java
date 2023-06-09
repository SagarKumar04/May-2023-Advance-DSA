package Tree.BinaryTree.AssignmentQuestions.InClass;

public class HeightOfBinaryTree {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    static int getHeight(Node node) {
        // Your code here
        if(node == null) {
            return 0;
        }
        return (1 + Math.max(getHeight(node.left), getHeight(node.right)));
    }
}
