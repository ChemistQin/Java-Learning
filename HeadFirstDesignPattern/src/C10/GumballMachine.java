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
		//投币
		if (state == HAS_QUARTER) {
			System.out.println("可以投币");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("已经投币");
		} else if (state == SOLD_OUT) {
			System.out.println("售罄");
		} else if (state == SOLD) {
			System.out.println("等待");
		}
	}
	
	public void ejectQuarter() {
		//退钱
		if (state == HAS_QUARTER) {
			System.out.println("退钱");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("还没投币，无法退钱");
		} else if (state == SOLD_OUT) {
			System.out.println("还没投币，无法退钱");
		} else if (state == SOLD) {
			System.out.println("已出货，无法退钱");
		}
	}
	
	public void turnCrank() {
		//转动手柄
		if (state == SOLD) {
			System.out.println("不能出两次");
		} else if (state == NO_QUARTER) {
			System.out.println("请先投币");
		} else if (state == SOLD_OUT) {
			System.out.println("售罄");
		} else if (state == HAS_QUARTER) {
			System.out.println("出货");
			state = SOLD;
			dispense();
		}
	}
	
	public void dispense() {
		//出货
		if (state == SOLD) {
			System.out.println("请取货");
			count -= 1;
			if (count == 0) {
				System.out.println("售罄了");
				state = SOLD_OUT;
			} else
				state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("请先付钱");
		} else if (state == SOLD_OUT) {
			System.out.println("售罄不能出货");
		} else if (state == HAS_QUARTER) {
			System.out.println("不能出货");
		}
	}
	

	public String toString() {
		switch (state) {
		case 0: return "SOLD_OUT";
		case 1: return "NO_QUARTER";
		case 2: return "HAS_QUARTER";
		case 3: return "SOLD";
		default:
			break;
		}
		return super.toString();
	}
}
