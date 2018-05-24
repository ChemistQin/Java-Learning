package C10;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		System.out.println("已投币");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	public void ejectQuarter() {
		System.out.println("你没投币");
	}
	
	public void turnCrank() {
		System.out.println("你没投币");
	}
	
	public void dispense() {
		System.out.println("你没投币");
	}
}
