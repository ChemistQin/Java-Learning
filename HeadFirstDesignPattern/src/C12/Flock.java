package C12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

public class Flock implements Quackable {
	ArrayList<Quackable> quackers = new ArrayList<>();
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	public void quack() {
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable)iterator.next();
			quacker.quack();
		}
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
