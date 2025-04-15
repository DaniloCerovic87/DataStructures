package SinglyLinkedList.problems.problem04_partitionList;

public class LinkedList {

    private Node head;
    private int length;

    static class Node {
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

    public void partitionList(int x) {
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;

        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = prev1.next;
            } else {
                prev2.next = current;
                prev2 = prev2.next;
            }
            current = current.next;
        }

        prev2.next = null;
        prev1.next = dummy2.next;
        head = dummy1.next;
    }

    public void partitionListInline(int x) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node firstGreaterOrEqualsPrev = dummy;
        Node firstGreaterOrEquals = head;

        while(firstGreaterOrEquals != null && firstGreaterOrEquals .value < x) {
            firstGreaterOrEqualsPrev = firstGreaterOrEquals;
            firstGreaterOrEquals  = firstGreaterOrEquals .next;
        }

        if(firstGreaterOrEquals  == null) {
            return;
        }

        Node current = firstGreaterOrEquals;
        Node pre = firstGreaterOrEqualsPrev;

        while(current != null) {
            Node next = current.next;
            if(current.value < x) {
                pre.next = current.next;
                firstGreaterOrEqualsPrev.next = current;
                current.next = firstGreaterOrEquals;
                firstGreaterOrEqualsPrev = current;
            } else {
                pre = current;
            }

            current = next;
        }

        head = dummy.next;
    }

}
