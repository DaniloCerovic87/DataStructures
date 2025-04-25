package Queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(7);
        System.out.println("First: " + queue.getFirst().value);
        System.out.println("Last: " + queue.getLast().value);
        System.out.println("Length: " + queue.getLength());

        queue.printQueue();

        queue.enqueue(8);
        queue.enqueue(9);
        System.out.println("First: " + queue.getFirst().value);
        System.out.println("Last: " + queue.getLast().value);
        System.out.println("Length: " + queue.getLength());

        queue.printQueue();
    }

}
