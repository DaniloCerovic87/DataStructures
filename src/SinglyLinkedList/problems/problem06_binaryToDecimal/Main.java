package SinglyLinkedList.problems.problem06_binaryToDecimal;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.append(0);
        ll.append(1);

        System.out.println(ll.binaryToDecimal());

        ll.append(1);

        System.out.println(ll.binaryToDecimal());
    }
}
