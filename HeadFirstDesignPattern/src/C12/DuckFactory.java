package C12;

public class DuckFactory extends AbstractDuckFactory {
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
	public Quackable createRedHeadDuck() {
		return new RedheadDuck();
	}
	public Quackable createDuckCall() {
		return new DuckCall();
	}
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
