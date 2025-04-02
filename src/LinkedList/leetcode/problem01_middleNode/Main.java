package LinkedList.leetcode.problem01_middleNode;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(7);
        ll.append(5);
        ll.append(7);
        ll.append(8);
        ll.append(9);

        System.out.println(ll.getMiddleNode().value);

        ll.append(10);

        System.out.println(ll.getMiddleNode().value);
    }
}
