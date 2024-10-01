package ss12_map.Thuc_Hanh;

public class InspectInOrder {
    private class Node {
        int data;
        Node left;
        Node right;
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    private class BinarySearchTree {
        Node root;
        public BinarySearchTree() {
            root = null;
        }
        void postorderTraversal(Node node, int degree) {
            if (node == null) {
                return;
            }
            degree++;
        }
    }
}
