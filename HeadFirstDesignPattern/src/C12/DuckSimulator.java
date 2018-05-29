package C12;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();;
	}
	
	void simulate() {
		Quackable mallardDuck =new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("Duck Simulator");
		simulate(rubberDuck);
		simulate(duckCall);
		simulate(redheadDuck);
		simulate(mallardDuck);
		simulate(gooseDuck);
		
		System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times.");
	}
	void simulate(Quackable duck) {
		duck.quack();
	}
}
