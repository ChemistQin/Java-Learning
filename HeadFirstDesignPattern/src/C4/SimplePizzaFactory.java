package C4;

public class SimplePizzaFactory {
	public Pizza creatPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("peperoni")) {
			pizza = new PepperoniPizza();
		} 
		return pizza;
	}
}
