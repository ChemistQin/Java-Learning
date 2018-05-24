package C10;

public class SoldState implements State {
	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		System.out.println("准备中，请等待");
	}
	
	public void ejectQuarter() {
		System.out.println("正在出货，无法退款");
	}
	
	public void turnCrank() {
		System.out.println("已经按过，不能按两次");
	}
	
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("售罄");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
