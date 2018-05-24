package C10;

public class WinnerState implements State {
	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		System.out.println("已投币");
	}
	
	public void ejectQuarter() {
		System.out.println("已投币");
	}
	
	public void turnCrank() {
		System.out.println("已投币");
	}
	
	public void dispense() {
		System.out.println("再来一个");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("售罄了");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
}
