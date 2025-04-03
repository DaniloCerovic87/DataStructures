package LinkedList.leetcode.problem05_removeDuplicates;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(3);
        ll.append(2);
        ll.append(7);
        ll.append(5);
        ll.append(9);
        ll.append(5);
        ll.append(7);

        ll.removeDuplicates();
        ll.printAll();
    }
}
