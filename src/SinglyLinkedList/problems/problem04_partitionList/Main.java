package SinglyLinkedList.problems.problem04_partitionList;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(3);
        ll.append(2);
        ll.append(7);
        ll.append(5);
        ll.append(9);

        ll.partitionList(7);
        ll.printAll();
    }
}
