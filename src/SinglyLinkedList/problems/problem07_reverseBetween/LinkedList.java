package SinglyLinkedList.problems.problem07_reverseBetween;

public class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length: " + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void reverseBetween(int startIndex, int endIndex) {
        if (head == null) {
            return;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        for (int i = 0; i < startIndex; i++) {
            prev = prev.next;
        }
        Node current = prev.next;

        for (int i = 0; i < endIndex - startIndex; i++) {
            Node toMove = current.next;
            current.next = toMove.next;
            toMove.next = prev.next;
            prev.next = toMove;
        }
        head = dummy.next;
    }

    public void reverseBetween2(int startIndex, int endIndex) {
        Node current = head;
        Node prev = null;
        for (int i = 0; i < startIndex; i++) {
            prev = current;
            current = current.next;
        }

        Node beforeReverseStart = prev;
        Node reversedTail = current;

        for (int i = startIndex; i <= endIndex; i++) {
            Node after = current.next;
            current.next = prev;
            prev = current;
            current = after;
        }

        if (beforeReverseStart != null) {
            beforeReverseStart.next = prev;
        } else {
            head = prev;
        }

        reversedTail.next = current;
    }

}
