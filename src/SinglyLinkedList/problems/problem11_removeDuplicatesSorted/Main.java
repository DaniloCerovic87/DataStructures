package SinglyLinkedList.problems.problem11_removeDuplicatesSorted;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(2);
        ll.append(2);
        ll.append(3);
        ll.append(3);
        ll.append(4);

        ll.removeDuplicatesSorted();
        ll.printAll();
    }
}
