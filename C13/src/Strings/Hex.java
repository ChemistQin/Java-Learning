package Strings;

public class Hex {
	public static String format(byte[] data) {
		StringBuilder result = new StringBuilder();
		int n = 0;
		for (byte b : data) {
			if(n % 16 == 0)
				result.append(String.format("%05X: ", n));
			result.append(String.format("%02X ", b));
		}
		result.append("\n");
		return result.toString();
	}
	public static void main(String[] args) throws Exception {
		byte[] data = {1,2,3,104};
		System.out.println(format(data));
	}

}
