package C12;

import java.util.Observer;

public class DuckCall implements Quackable {
	public void quack() {
		System.out.println("Kwak");
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
