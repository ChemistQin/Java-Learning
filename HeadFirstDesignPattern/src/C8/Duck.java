package C8;

public class Duck implements Comparable {
	String name;
	double weight;
	public Duck(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	public String toString() {
		return name + " weight:" + weight + "kg";
	}
	public int compareTo(Object object) {
		Duck otherDuck = (Duck)object;
		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else 
			return -1;
	}
}
