package C8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
	public void brew() {
		System.out.println("泡咖啡");
	}
	public void addCondiments() {
		System.out.println("加🥛加🍬");
	}
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		return true;
	}
	private String getUserInput() {
		String answer = null;
		System.out.println("加调料吗？(y/n)");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.err.println("IO错误");
		}
		if (answer == null) {
			return "不加";
		}
		return answer;
	}
}
