package Strings;

import java.math.BigInteger;
import java.util.Formatter;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter f = new Formatter(System.out);
		
		char u = 'a';
		System.out.println("u = 'a' ");
		f.format("s: %s\n", u);
		f.format("c: %c\n", u);
		f.format("b: %b\n", u);
		//f.format("f: %f\n", u);
		//f.format("e: %e\n", u);
		//f.format("x: %x\n", u);
		f.format("h: %h\n", u);
		
		int i = 64;
		System.out.println("\ni = 64 ");
		f.format("d: %d\n", i);
		f.format("c: %c\n", i);
		f.format("b: %b\n", i);
		f.format("s: %b\n", i);
		//f.format("f: %f\n", i);
		//f.format("e: %e\n", i);
		f.format("x: %x\n", i);
		f.format("h: %h\n", i);
		
		BigInteger bigInteger = new BigInteger("666666666666666");
		System.out.println("\nbigInteger = new BigInteger(\"666666666666666\")");
		f.format("d: %d\n", bigInteger);
		//f.format("c: %c\n", bigInteger);
		f.format("b: %b\n", bigInteger);
		f.format("s: %s\n", bigInteger);
		//f.format("e: %e\n", u);
		f.format("x: %x\n", bigInteger);
		f.format("h: %h\n", bigInteger);
		
		
		// d---integer
		// c---unicode char
		// b---boolean
		// s---string
		// f---float
		// e---float(scientific notation)
		System.out.printf("\nScientific notation:   %e\n", Math.cos(Math.PI));
		
		// x---hex
		// h---hash
		
		
	}

}
