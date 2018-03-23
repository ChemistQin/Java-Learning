import java.lang.Math.*;
public class Control {
	public static void main(String[] args) {
		for(char c = 101; c < 128; c++)
			if(Character.isLowerCase(c))
				System.out.println("value = " + (int)c + ", character = " + c);//print characters from 101(e) to 122(z).

		
		int f[] = new int[10];
		for(int i = 0; i < 10; i++)
			f[i] = i;
		for(float x : f)
			System.out.println(x); //C++11 里面，有for(auto x : f)的用法

	}
}