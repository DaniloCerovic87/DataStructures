package Tree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("Root " + myBST.getRoot());

//        System.out.println("Added 2: " + myBST.insert(2));
//        System.out.println("Added 1: " + myBST.insert(1));
//        System.out.println("Added 3: " + myBST.insert(3));

        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);
        myBST.rInsert(4);
        myBST.rDelete(4);

        System.out.println("Try to add 3 again: " + myBST.insert(3));

        System.out.println("Root: " + myBST.getRoot().value);
        System.out.println("First left: " + myBST.getRoot().left.value);
        System.out.println("First right: " + myBST.getRoot().right.value);

        System.out.println("Contains 1: " + myBST.contains(1));
        System.out.println("Contains 2: " + myBST.contains(2));
        System.out.println("Contains 3: " + myBST.contains(3));
        System.out.println("Contains 4: " + myBST.contains(4));

        System.out.println("Recursive contains 1: " + myBST.rContains(1));
        System.out.println("Recursive contains 2: " + myBST.rContains(2));
        System.out.println("Recursive contains 3: " + myBST.rContains(3));
        System.out.println("Recursive contains 4: " + myBST.rContains(4));

        BinarySearchTree myBST2 = new BinarySearchTree();

        myBST2.insert(47);
        myBST2.insert(21);
        myBST2.insert(76);
        myBST2.insert(18);
        myBST2.insert(27);
        myBST2.insert(52);
        myBST2.insert(82);

//        System.out.println(myBST2.BFS());
//        System.out.println(myBST2.DFSPreOrder());
//        System.out.println(myBST2.DFSPostOrder());
        System.out.println(myBST2.DFSInOrder());
    }

}
