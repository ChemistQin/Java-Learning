package C12;

public class CountingDuckFactory extends AbstractDuckFactory {
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
	public Quackable createRedHeadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
