package thread;

import java.util.Date;

class LockA implements Runnable {
	public void run() {
		try {
			System.out.println(new Date().toString() + " LockA run.");
			while (true) {
				synchronized (DeadLockTest.obj1) {
					System.out.println(new Date().toString() + " LockA locked obj1.");
					Thread.sleep(3000); 
					synchronized (DeadLockTest.obj2) {
						System.out.println(new Date().toString()  + " LockA locked obj2.");
						Thread.sleep(30000);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class LockB implements Runnable {
	public void run() {
		try {
			System.out.println(new Date().toString() + " LockB run.");
			while (true) {
				synchronized (DeadLockTest.obj2) {
					System.out.println(new Date().toString() + " LockB locked obj2.");
					Thread.sleep(3000); 
					synchronized (DeadLockTest.obj1) {
						System.out.println(new Date().toString()  + " LockB locked obj1.");
						Thread.sleep(30000);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class DeadLockTest {
	public static String obj1 = "obj1";
	public static String obj2 = "obj2";
	public static void main(String[] args) {
		LockA lockA = new LockA();
		new Thread(lockA).start();
		LockB lockB = new LockB();
		new Thread(lockB).start();
	}
}
