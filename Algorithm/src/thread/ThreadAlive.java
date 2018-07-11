package thread;

public class ThreadAlive implements Runnable{
	public void run() {
		for (int i = 0; i < 5; i++) {
			printMsg();
		}
	}
	
	public void printMsg() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println("name = " + name);
	}
	
	public static void main(String[] args) {
		ThreadAlive threadAlive = new ThreadAlive();
		Thread t1 = new Thread(threadAlive);
		t1.setName("Thread 1");
		System.out.println("before start(), t1.isAlive() = " + t1.isAlive());
		t1.start();
		System.out.println("after start(), t1.isAlive() = " + t1.isAlive());
		for (int i = 0; i < 5; i++) {
			threadAlive.printMsg();
		}
		System.out.println("the end of main(), t1.isAlive() = " + t1.isAlive());
	}
}
