package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
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
        tail = newNode;
        length = 1;
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
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
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
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            tail = newNode;
        } else {
            newNode.next = head;
        }
        head = newNode;
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public int sumRecursive() {
        return doSumRecursive(head);
    }

    private int doSumRecursive(Node node) {
        if(node == null) {
            return 0;
        }

        return node.value + doSumRecursive(node.next);
    }

    public int sumIterative() {
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum += current.value;
            current = current.next;
        }
        return sum;
    }

    public Node getRecursive(int index) {
        return doGetRecursive(head, index);
    }

    public Node getIterative(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private Node doGetRecursive(Node node, int index) {
        if(node == null) {
            return null;
        }

        if(index == 0) {
            return node;
        }

        return doGetRecursive(node.next, index - 1);
    }

    public boolean set(int index, int value) {
        Node temp = getIterative(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = getIterative(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index > length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if(index == length - 1) {
            return removeLast();
        }

        Node pre = getIterative(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverseIterative() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void reverseRecursive() {
        doReverseRecursive(head, null);
    }

    public void doReverseRecursive(Node current, Node prev) {
        if (current == null) {
            head = prev;
            return;
        }
        Node next = current.next;
        current.next = prev;
        doReverseRecursive(next, current);
    }

}

