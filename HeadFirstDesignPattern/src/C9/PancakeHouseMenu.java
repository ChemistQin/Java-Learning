package C9;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		addItem("1st", "one", false, 2.1);
		addItem("2nd", "two", true, 1.2);
		addItem("3rd", "three", false, 4.1);
		addItem("4th", "four", true, 2.5);
	}
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
}
