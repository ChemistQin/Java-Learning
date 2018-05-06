package C1;

public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	public Duck() {}
	public void performQuack() {
		quackBehavior.quack(); //委托quackBehavior处理quack行为
	}
	public void performFly() {
		flyBehavior.fly(); //委托flyBehavior处理fly行为
	}
	public abstract void display();
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	
}
