package C10;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		System.out.println("售罄，无法投币");
	}
	
	public void ejectQuarter() {
		System.out.println("你没投币，无法退款");
	}
	
	public void turnCrank() {
		System.out.println("你没投币");
	}
	
	public void dispense() {
		System.out.println("售罄");
	}
}
