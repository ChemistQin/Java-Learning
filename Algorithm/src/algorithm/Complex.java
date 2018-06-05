package algorithm;

import java.util.Scanner;

public class Complex {
	double real;
	double image;
	
	public Complex() {
		Scanner scanner = new Scanner(System.in);
		double real = scanner.nextDouble();
		double image = scanner.nextDouble();
		Complex(real, image);
	}
	
	private void Complex(double real, double image) {
		this.real = real;
		this.image = image;
	}
	
	Complex(double real, double image) {
		this.real = real;
		this.image = image;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImage() {
		return image;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public void setImage(double image) {
		this.image = image;
	}
	
	Complex add(Complex complex2) {
		// complex + operator
		double newReal = this.real + complex2.real;
		double newImage = this.image + complex2.image;
		Complex newComplex = new Complex(newReal, newImage);
		return newComplex;
	}
	
	Complex sub(Complex complex2) {
		//complex - operator
		double newReal = this.real - complex2.real;
		double newImage = this.image - complex2.image;
		Complex newComplex = new Complex(newReal, newImage);
		return newComplex;
	}
	
	Complex mul(Complex complex2) {
		//complex * operator
		double newReal = this.real*complex2.real - this.image*complex2.image;
		double newImage = this.image*complex2.real - this.real*complex2.image;
		Complex newComplex = new Complex(newReal, newImage);
		return newComplex;
	}
	
	Complex div(Complex complex2) {
		//complex / operator
		double denominator = complex2.real*complex2.real + complex2.image*complex2.image;
		double newReal = (this.real*complex2.real + this.image*complex2.image)/denominator;
		double newImage = (this.image*complex2.real - this.real*complex2.image)/denominator;
		Complex newComplex = new Complex(newReal, newImage);
		return newComplex;
	}
	
	public void show() {
		if (image > 0) {
			System.out.println(real + " + " + image + "i");
		} else if (image < 0 ) {
			System.out.println(real + "   " + image + "i");
		} else {
			System.out.println(real);
		}
	}
}

/* test:
 		Complex complex1 = new Complex(1, 1);
		Complex complex2 = new Complex(3, 1);
		
		Complex addResult = complex1.add(complex2);
		Complex subResult = complex1.sub(complex2);
		Complex mulResult = complex1.mul(complex2);
		Complex divResult = complex1.div(complex2);
		addResult.show();
		subResult.show();
		mulResult.show();
		divResult.show(); 
 */


