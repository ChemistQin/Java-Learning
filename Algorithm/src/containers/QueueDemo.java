package containers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
	public static void printQueue(Queue queue) {
		while (queue.peek() != null) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			queue.offer(random.nextInt(i + 10));
		}
		printQueue(queue);
		
		Queue<Character> queue2 = new LinkedList<>();
		for (Character character : "Sometimes Naive".toCharArray()) {
			queue2.offer(character);
		}
		printQueue(queue2);
	}
}
