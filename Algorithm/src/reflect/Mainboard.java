package reflect;

public class Mainboard {
	public void run() {
		System.out.println("Mainboard run.");
	}
	public void usePCI(PCI pci) {
		pci.open();
		pci.close();
	}
}
