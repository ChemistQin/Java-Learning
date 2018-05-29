package C12;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();		
		simulator.simulate(duckFactory);;
	}
	
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedHeadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		
		
		System.out.println("Duck Simulator");
		
		simulate(flockOfDucks);
		
		System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times.");
	}
	void simulate(Quackable duck) {
		duck.quack();
	}
}
