package DoublyLinkedList.problems.problem04_swapPairs;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList ll1 = new DoublyLinkedList(1);
        ll1.append(2);
        ll1.swapPairs();
        ll1.printAll();

        DoublyLinkedList ll2 = new DoublyLinkedList(1);
        ll2.append(2);
        ll2.append(3);
        ll2.append(4);
        ll2.swapPairs();
        ll2.printAll();

        DoublyLinkedList ll3 = new DoublyLinkedList(1);
        ll3.append(2);
        ll3.append(3);
        ll3.append(4);
        ll3.append(5);
        ll3.swapPairs();
        ll3.printAll();


    }
}
