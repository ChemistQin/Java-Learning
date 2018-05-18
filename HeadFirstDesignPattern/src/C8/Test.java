package C8;

public class Test {
	public static void main(String[] args) {
		Tea tea = new Tea();
		System.out.println("🍵");
		tea.prepareRecipe();
		
		Coffee coffee = new Coffee();
		System.out.println("☕️");
		coffee.prepareRecipe();
	}
}
