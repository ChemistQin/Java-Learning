package TypeInfo;

import java.util.*;


abstract class Shape {
	void draw() {
		System.out.println(this + ".draw()");
	}
	abstract public String toString();
}

class Circle extends Shape {
	public String toString() {
		return "Circle";
	}
}

class Square extends Shape {
	public String toString() {
		return "Square";
	}
}
class Triangle extends Shape {
	public String toString() {
		return "Triangle";
	}
}

class Rhomboid extends Shape {
	public String toString() {
		return "Rhomboid";
	}
}

public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
		for (Shape shape : shapeList) {
			shape.draw();
		}
		Shape shape = new Rhomboid();
		Rhomboid rhomboid = (Rhomboid)shape;
		// Circle circle = (Circle)shape;
		// TypeInfo.Rhomboid cannot be cast to TypeInfo.Circle.C14E3
		
	}
}
