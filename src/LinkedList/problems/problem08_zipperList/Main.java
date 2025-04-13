package LinkedList.problems.problem08_zipperList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList(1);
        linkedList1.append(3);
        linkedList1.append(5);
        linkedList1.append(7);

        LinkedList linkedList2 = new LinkedList(2);
        linkedList2.append(4);
        linkedList2.append(6);

        linkedList1.zipperList(linkedList2).printAll();
    }

}
