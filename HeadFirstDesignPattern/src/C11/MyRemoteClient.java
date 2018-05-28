package C11;

import java.rmi.Naming;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient();
		
	}
	public void go() {
		try {
			MyRemote service = (MyRemote) Naming.lookup( "rmi://127.0.0.1/RemoteHello" );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
