package DoublyLinkedList.problems.problem04_swapPairs;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length: " + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;

        length++;
    }

    public void swapPairs() {
        Node current = head;
        Node prev = null;
        while (current != null && current.next != null) {
            Node second = current.next;
            Node third = second.next;
            current.next = third;
            current.prev = second;
            second.next = current;
            second.prev = prev;

            if (third != null) {
                third.prev = current;
            } else {
                tail = current;
            }

            if (prev != null) {
                prev.next = second;
            } else {
                head = second;
            }

            prev = current;
            current = current.next;
        }
    }

}
