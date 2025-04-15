package SinglyLinkedList.problems.problem03_KthNodeFromEnd;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(7);
        ll.append(5);
        ll.append(7);
        ll.append(8);
        ll.append(9);

        System.out.println(ll.findKthFromEnd(2).value);
        System.out.println(ll.findKthFromEnd(9));
        System.out.println(ll.findKthFromEnd(5).value);
        System.out.println(ll.findKthFromEnd(1).value);
    }
}
