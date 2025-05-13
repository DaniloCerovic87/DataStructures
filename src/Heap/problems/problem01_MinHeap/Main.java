package Heap.problems.problem01_MinHeap;

public class Main {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(3);
        minHeap.insert(4);
        minHeap.insert(5);
        minHeap.insert(2);

        minHeap.remove();
        System.out.println(minHeap.getHeap());
    }

}
