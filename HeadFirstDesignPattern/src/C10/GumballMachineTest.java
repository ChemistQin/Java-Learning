package C10;

public class GumballMachineTest {
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);

	}
}
