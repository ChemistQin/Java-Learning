package C3;
//naive咖啡店 +1s.
public class NaiveCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " cost $" + beverage.cost());
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " cost $" + beverage2.cost());
		Beverage beverage3  = new DarkRoast();
		beverage3 = new Mocha(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " cost $" + beverage3.cost());
	}
}
