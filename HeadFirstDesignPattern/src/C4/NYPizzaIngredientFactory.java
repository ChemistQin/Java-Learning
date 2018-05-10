package C4;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThinCrustDough();
		//NY Style 薄饼
	}
	public Sauce createSauce() {
		return new MarinaraSauce();
		//意大利西红柿酱
	}
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
 		return veggies;
	}
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	public Clams createClams() {
		return new FreshClams();
	}
}
