package SinglyLinkedList.problems.problem12_swapPairs;

public class Main {

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList(1);
        ll1.append(2);
        ll1.append(3);
        ll1.swapPairs();
        ll1.printAll();

        LinkedList ll2 = new LinkedList(1);
        ll2.append(2);
        ll2.append(3);
        ll2.append(4);
        ll2.swapPairs();
        ll2.printAll();

        LinkedList ll3 = new LinkedList(1);
        ll3.append(2);
        ll3.append(3);
        ll3.append(4);
        ll3.append(5);
        ll3.swapPairs();
        ll3.printAll();

    }

}
