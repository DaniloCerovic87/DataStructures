package Queue;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue( 7 );
		System.out.println(queue.getFirst().value);
		System.out.println(queue.getLast().value);
		System.out.println(queue.getLength());

		queue.printQueue();
	}

}
