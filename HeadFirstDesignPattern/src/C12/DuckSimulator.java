package C12;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();;
	}
	
	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		
		System.out.println("Duck Simulator");
		simulate(rubberDuck);
		simulate(duckCall);
		simulate(redheadDuck);
		simulate(mallardDuck);
		
	}
	void simulate(Quackable duck) {
		duck.quack();
	}
}
