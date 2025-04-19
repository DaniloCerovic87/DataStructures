package DoublyLinkedList.problems.problem03_palindromeChecker;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList ll1 = new DoublyLinkedList(1);
        ll1.append(2);
        ll1.append(3);
        ll1.append(4);
        ll1.append(5);

        System.out.println(ll1.isPalindrome());

        DoublyLinkedList ll2 = new DoublyLinkedList(1);
        ll2.append(2);
        ll2.append(3);
        ll2.append(2);
        ll2.append(1);

        System.out.println(ll2.isPalindrome());
    }
}
