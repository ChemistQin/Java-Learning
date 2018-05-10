package C4;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThickCrustDough();
		//Chicago Style 厚饼
	}
	public Sauce createSauce() {
		return new PlumTomatoSauce();
		//梅子西红柿酱
	}
	public Cheese createCheese() {
		return new Mozzarella();
	}
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new BlackOlives(), new EggPlant(), new Spinach() };
 		return veggies;
	}
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	public Clams createClams() {
		return new FrozenClams();
	}
}
