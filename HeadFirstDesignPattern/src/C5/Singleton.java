package C5;

public class Singleton {
	//private static Singleton uniqueInstance;
	private volatile static Singleton uniqueInstance;
	private Singleton() {}
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
