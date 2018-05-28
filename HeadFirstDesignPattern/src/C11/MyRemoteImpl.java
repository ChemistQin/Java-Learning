package C11;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;




public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	public MyRemoteImpl() throws RemoteException {}
	public String sayHello() {
		return "Server : hello world.";
	}
	public static void main(String[] args) {
		try {
			MyRemote servive = new MyRemoteImpl();
			Naming.rebind("RemoteHello", servive);
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
