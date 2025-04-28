package Queue.problems.problem01_enqueueAndDequeueUsingStacks;

public class Main {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front of the queue: " + queue.peek());
        System.out.println("Is the queue empty? " + queue.isEmpty());

        System.out.println("Enqueued element: " + queue.deque());
        System.out.println("Enqueued element: " + queue.deque());
        System.out.println("Enqueued element: " + queue.deque());

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }

}
