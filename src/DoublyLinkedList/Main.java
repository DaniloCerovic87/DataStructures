package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList ll = new DoublyLinkedList(7);
        ll.append(8);
        ll.append(9);

        ll.printAll();

        System.out.println("Removed node: " + ll.removeLast().value);
        System.out.println("Removed node: " + ll.removeLast().value);
        System.out.println("Removed node: " + ll.removeLast().value);

        ll.printAll();

        ll.prepend(3);
        ll.prepend(2);
        ll.prepend(1);

        ll.printAll();

        System.out.println("Removed node: " + ll.removeFirst().value);

        ll.printAll();

        ll.prepend(1);
        ll.prepend(0);

        ll.printAll();

        ll.set(0, 7);
        ll.set(1, 8);
        ll.set(2, 9);
        ll.set(3, 10);

        ll.printAll();

        ll.insert(0, 6);
        ll.insert(5, 12);
        ll.insert(5, 11);

        ll.printAll();

        System.out.println("Removed node: " + ll.remove(0).value);
        System.out.println("Removed node: " + ll.remove(3).value);
        System.out.println("Removed node: " + ll.remove(4).value);

        ll.printAll();
    }

}
