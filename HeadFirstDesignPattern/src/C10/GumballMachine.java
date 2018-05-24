package C10;

public class GumballMachine {
	//final static int SOLD_OUT = 0; //糖果售罄
	//final static int NO_QUARTER = 1; //没有25分钱
	//final static int HAS_QUARTER = 2; //有25分钱
	//final static int SOLD = 3; //售出糖果
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	//int state = SOLD_OUT;
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		//投币
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		//退钱
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		//转动手柄
		state.turnCrank();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void releaseBall() {
		System.out.println("出货");
		if (count != 0) {
			count -= 1;
		}
	}
	
	State getHasQuarterState() {
		return this.hasQuarterState;
	}
	
	State getNoQuarterState() {
		return this.noQuarterState;
	}
	
	State getSoldOutState() {
		return this.soldOutState;
	}
	
	State getSoldState() {
		return this.soldState;
	}
	
	State getWinnerState() {
		return this.winnerState;
	}
	
	int getCount() {
		return count;
	}
	
	void refill(int refillNumber) {
		this.count = refillNumber;
		this.setState(this.getNoQuarterState());
		System.out.println("装填" + refillNumber + "个" + "🍬");
	}
	
}
