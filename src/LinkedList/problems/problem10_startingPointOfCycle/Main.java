package LinkedList.problems.problem10_startingPointOfCycle;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(3);

        LinkedList.Node node2 = new LinkedList.Node(2);
        LinkedList.Node node0 = new LinkedList.Node(0);
        LinkedList.Node node4 = new LinkedList.Node(4);

        ll.getHead().next = node2;
        node2.next = node0;
        node0.next = node4;
        node4.next = node2;

        System.out.println(ll.getStartingPointOfCycle().value);
    }
}
