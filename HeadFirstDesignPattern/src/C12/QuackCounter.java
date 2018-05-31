package C12;

import java.util.Observer;

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

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
}
