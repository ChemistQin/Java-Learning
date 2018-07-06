package thread;

public class Ticket implements Runnable {
	private int number = 99;
	public void run() {
		while (true) {
			if (number > 0) {
				System.out.println(Thread.currentThread().getName() + "..sale.." + number--);
			}
		}
	}
}
