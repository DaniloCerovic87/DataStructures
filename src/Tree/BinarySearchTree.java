package Tree;

public class BinarySearchTree {

    private Node root;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

}
