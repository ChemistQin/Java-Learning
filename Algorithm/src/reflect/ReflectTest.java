package reflect;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReflectTest {
	public static void main(String[] args) throws Exception {
		Mainboard mainboard = new Mainboard();
		mainboard.run();
		
		File configFlie = new File("pci.properties");
		
		Properties properties = new Properties();
		
		FileInputStream fileInputStream = new FileInputStream(configFlie);
		
		properties.load(fileInputStream);
		
		for (int i = 0; i < properties.size(); i++) {
			
			String pciName = properties.getProperty("pci" + (i + 1));
			
			Class clazz = Class.forName(pciName);
			
			//deprecated:
			//PCI pci = (PCI)clazz.newInstance();
			//replace by:
			PCI pci = (PCI) clazz.getDeclaredConstructor().newInstance();
			
			mainboard.usePCI(pci);
			
		}
		
		fileInputStream.close();
		
	}
}
