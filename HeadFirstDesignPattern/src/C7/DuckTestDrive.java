package C7;

public class DuckTestDrive {
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		WildTurkey wildTurkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		System.out.println("Turkey say...");
		wildTurkey.gobble();
		wildTurkey.fly();
		
		System.out.println("Duck say ...");
		testDuck(mallardDuck);
		System.out.println("Turkey Adapter say ...");
		testDuck(turkeyAdapter);
	}
}
