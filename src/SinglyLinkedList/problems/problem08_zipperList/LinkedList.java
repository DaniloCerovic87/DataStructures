package SinglyLinkedList.problems.problem08_zipperList;

public class LinkedList {

    private Node head;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        head = new Node(value);
    }

    public LinkedList(Node node) {
        this.head = node;
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
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public LinkedList zipperList(LinkedList other) {
        Node tail = head;
        Node current1 = head.next;
        Node current2 = other.head;
        int count = 0;

        while (current1 != null && current2 != null) {
            if (count % 2 == 0) {
                tail.next = current2;
                current2 = current2.next;
            } else {
                tail.next = current1;
                current1 = current1.next;
            }
            tail = tail.next;
            count++;
        }

        if (current1 != null) {
            tail.next = current1;
        }

        if (current2 != null) {
            tail.next = current2;
        }
        return new LinkedList(head);
    }

}
