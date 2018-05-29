package C12;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	
	public void quack() {
		duck.quack();
		numberOfQuacks += 1;
	}
	
	public static int getNumberOfQuacks() {
		return numberOfQuacks;
	}
}
