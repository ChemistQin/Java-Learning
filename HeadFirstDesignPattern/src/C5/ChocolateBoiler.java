package C5;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	public static ChocolateBoiler uniqueInstance;
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
		System.out.println("启用锅炉");
	}
	public static ChocolateBoiler getInstance() {
			if(uniqueInstance == null) {
				uniqueInstance = new ChocolateBoiler();	
				return uniqueInstance;
			} else 
				return null;
			
	}
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("填料");
		} else
			System.out.println("无法填料：炉满");
	}
	public void drain() {
		if (isBoiled() && !isEmpty()) {
			empty = true;
			System.out.println("排料");
		} else
			System.out.println("无法排料：炉空或原料未沸");
	}
	public void boil() {
		if (!isBoiled() && !isEmpty()) {
			boiled = true;
			System.out.println("煮沸");
		} else
			System.out.println("无法煮沸：炉空或原料已沸");	
	}
	public boolean isEmpty() {
		return empty;
	}
	public boolean isBoiled() {
		return boiled;
	}
	public static void main(String[] args) {
		ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
		chocolateBoiler.fill();
		chocolateBoiler.boil();
		chocolateBoiler.drain();
		chocolateBoiler.fill();
		chocolateBoiler.boil();
		chocolateBoiler.boil();//error
		chocolateBoiler.drain();
		chocolateBoiler.drain(); //error
	}
}
