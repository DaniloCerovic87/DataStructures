package SinglyLinkedList.problems.problem02_hasLoop;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        LinkedList.Node node2 = new LinkedList.Node(2);
        LinkedList.Node head = ll.getHead();
        head.next = node2;
        LinkedList.Node node3 = new LinkedList.Node(3);
        node2.next = node3;

        LinkedList.Node node4 = new LinkedList.Node(4);
        node3.next = node4;

        LinkedList.Node node5 = new LinkedList.Node(5);
        node4.next = node5;

        LinkedList.Node node6 = new LinkedList.Node(6);
        node5.next = node6;

        System.out.println(ll.hasLoop());

        node6.next = head;

        System.out.println(ll.hasLoop());
    }
}
