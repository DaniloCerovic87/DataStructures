package DoublyLinkedList.problems.problem01_swapFirstLast;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        ll.swapFirstLast();
        ll.printAll();
    }
}
