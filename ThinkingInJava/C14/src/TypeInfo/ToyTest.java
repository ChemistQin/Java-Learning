package TypeInfo;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface NewIn {}

class Toy {
	Toy() {}
	Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, NewIn{
	FancyToy() {
		super(1);
	}
	int i = 66;
}

public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name: " + cc.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("TypeInfo.FancyToy");
		} catch(ClassNotFoundException e) {
			System.out.println("FancyToy not found");
			System.exit(0);
		}
		printInfo(c);
		for (Class face : c.getInterfaces()) {
			printInfo(face);
		}
		Class up = c.getSuperclass();
		Object object = null;
		try {
			object = up.newInstance();
		} catch (InstantiationException e) {
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(object.getClass());
	}
}
