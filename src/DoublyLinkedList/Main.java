package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList ll = new DoublyLinkedList(7);
        ll.append(8);
        ll.append(9);

        System.out.println("Node on index 0: " + ll.get(0).value);
        System.out.println("Node on index 1: " + ll.get(1).value);
        System.out.println("Node on index 2: " + ll.get(2).value);

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

        ll.prepend(3);
        ll.prepend(2);
        ll.prepend(1);

        System.out.println("Head " + ll.getHead().value);
        System.out.println("Tail " + ll.getTail().value);
        System.out.println("Length " + ll.getLength());
        ll.printList();

        System.out.println("Removed node: " + ll.removeFirst().value);

        System.out.println("Head " + ll.getHead().value);
        System.out.println("Tail " + ll.getTail().value);
        System.out.println("Length " + ll.getLength());
        ll.printList();

        ll.prepend(1);
        ll.prepend(0);

        ll.set(0, 7);
        ll.set(1, 8);
        ll.set(2, 9);
        ll.set(3, 10);

        System.out.println("Head " + ll.getHead().value);
        System.out.println("Tail " + ll.getTail().value);
        System.out.println("Length " + ll.getLength());
        ll.printList();

        ll.insert(0, 6);
        ll.insert(5, 12);
        ll.insert(5, 11);

        System.out.println("Head " + ll.getHead().value);
        System.out.println("Tail " + ll.getTail().value);
        System.out.println("Length " + ll.getLength());
        ll.printList();

        System.out.println("Removed node: " + ll.remove(0).value);
        System.out.println("Removed node: " + ll.remove(3).value);
        System.out.println("Removed node: " + ll.remove(4).value);

        System.out.println("Head " + ll.getHead().value);
        System.out.println("Tail " + ll.getTail().value);
        System.out.println("Length " + ll.getLength());
        ll.printList();
    }

}
