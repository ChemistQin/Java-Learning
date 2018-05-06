package C1;

interface QuackBehavior {
	 void quack();
}

class Quack implements QuackBehavior {
	public void quack() {}
}

class Squeak implements QuackBehavior {
	public void quack () {}
}

class MuteQuack implements QuackBehavior {
	public void quack() {}
}

interface FlyBehavior {
	void fly();
}

class FlyWithWings implements FlyBehavior {
	public void fly() {}
}

class FlyNoWay implements FlyBehavior {
	public void fly() {}
}

public class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public void performQuack() {
		quackBehavior.quack(); //委托quackBehavior处理quack行为
	}
	public void performFly() {
		flyBehavior.fly(); //委托flyBehavior处理fly行为
	}
	public void display() {}
	public void swim() {}

	
}
