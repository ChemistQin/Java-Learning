package C10;

public class GumballMachine {
	final static int SOLD_OUT = 0; //糖果售罄
	final static int NO_QUARTER = 1; //没有25分钱
	final static int HAS_QUARTER = 2; //有25分钱
	final static int SOLD = 3; //售出糖果
	
	int state = SOLD_OUT;
	int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
	
	public void insertQuarter() {
		
	}
	
	public void ejectQuarter() {
		
	}
	
	public void turnCrank() {
		
	}
	
	public void dispense() {
		
	}
}
