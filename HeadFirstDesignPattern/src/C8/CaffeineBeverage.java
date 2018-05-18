package C8;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	abstract void brew();
	abstract void addCondiments();
	void boilWater() {
		System.out.println("烧水");
	}
	void pourInCup() {
		System.out.println("倒进杯子");
	}
	boolean customerWantsCondiments() {
		return true;
	}
}
