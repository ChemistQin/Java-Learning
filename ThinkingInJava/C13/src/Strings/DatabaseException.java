package Strings;

public class DatabaseException extends Exception {
	public DatabaseException(int transactionID, int queryID, String message) {
		super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
	}
	public static void main(String[] args) {
		try {
			throw new DatabaseException(5, 6, "write failed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
