package SinglyLinkedList.problems.problem09_removeNodes;

public class Main {

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList(11);
        ll1.append(7);
        ll1.append(5);
        ll1.append(12);
        ll1.append(9);
        ll1.append(5);
        ll1.append(11);

        ll1.removeNodesWithValueGreaterThan10();

        ll1.printAll();

        LinkedList ll2 = new LinkedList(11);
        ll2.append(12);
        ll2.append(13);

        ll2.removeNodesWithValueGreaterThan10();

        ll2.printAll();

        LinkedList ll3 = new LinkedList(1);
        ll3.append(2);
        ll3.append(5);

        ll3.removeNodesWithValueGreaterThan10();

        ll3.printAll();
    }
}
