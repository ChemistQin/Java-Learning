//C5E10
public class C5E10 {
	protected void finalize(){
	//注: C5E10.java使用或覆盖了已过时的 API。
    //注: 有关详细信息, 请使用 -Xlint:deprecation 重新编译。
		System.out.println("finalize() called");
	}
	public static void main(String[] args) {
		new C5E10();
	}
}