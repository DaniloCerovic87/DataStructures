package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList ll = new DoublyLinkedList(7);
        ll.append(8);
        ll.append(9);

        System.out.println("Head " + ll.getHead().value);
        System.out.println("Tail " + ll.getTail().value);
        System.out.println("Length " + ll.getLength());
        ll.printList();

        System.out.println("Removed node: " + ll.removeLast().value);
        System.out.println("Removed node: " + ll.removeLast().value);
        System.out.println("Removed node: " + ll.removeLast().value);

        System.out.println("Head " + ll.getHead());
        System.out.println("Tail " + ll.getTail());
        System.out.println("Length " + ll.getLength());
        ll.printList();

    }

}
