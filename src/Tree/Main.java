package Tree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("Root " + myBST.getRoot());

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        System.out.println("Root: " + myBST.getRoot().value);
        System.out.println("First left: " + myBST.getRoot().left.value);
        System.out.println("First right: " + myBST.getRoot().right.value);
    }

}
