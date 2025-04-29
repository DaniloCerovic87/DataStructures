package Queue.problems.problem03_rotatingQueueByKPositions;

import java.util.LinkedList;
import java.util.Queue;

public class RotatingQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Danilo");
        queue.add("Sofija");
        queue.add("Ljiljana");
        System.out.println(queue);
        rotateQueue(queue, 2);
        System.out.println(queue);
        rotateQueue(queue, 1);
        System.out.println(queue);
    }

    private static void rotateQueue(Queue<String> queue, int k) {
        for(int i = 0; i < k; i++) {
            String element = queue.poll();
            queue.add(element);
        }
    }

}
