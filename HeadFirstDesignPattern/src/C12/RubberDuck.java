package C12;

import java.util.Observer;

public class RubberDuck implements Quackable {
	public void quack() {
		System.out.println("Squeak");
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
