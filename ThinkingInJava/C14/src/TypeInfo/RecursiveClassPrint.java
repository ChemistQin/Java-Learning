package TypeInfo;

import java.lang.reflect.*;
import java.util.*;


public class RecursiveClassPrint {
	static Set<Class<?>> alreadyDisplayed = new HashSet<Class<?>>();
	//C14E8
	static void printClasses(Class<?> class1) {	
		if(class1 == null) 
			return;
		System.out.println(class1.getName());
		for (Class<?> kClass : class1.getInterfaces()) {
			System.out.println("Interface: " + kClass.getName());
			printClasses(kClass.getSuperclass());
		}
		printClasses(class1.getSuperclass());
	}
	//C14E9
	static void printClassFields(Class<?> class1) {		
		if(class1 == null) 
			return;
		System.out.println(class1.getName());
		Field[] fields = class1.getDeclaredFields();
		if(fields.length != 0)
			System.out.println("Fields:");
		for (Field field : fields) {
			System.out.println("    " + field);
		}
		for (Field field : fields) {
			Class<?> class2 = field.getType();
			if(!alreadyDisplayed.contains(class2)) {
				printClassFields(class2);
				alreadyDisplayed.add(class2);
			}
		}
		for (Class<?> class2 : class1.getInterfaces()) {
			System.out.println("Interface: " + class2.getName());
			printClassFields(class2.getSuperclass());
		}
		printClassFields(class1.getSuperclass());
	}
	public static void main(String[] args) throws Exception {		
		System.out.println("printClasses():");
		printClasses(Class.forName("TypeInfo.FancyToy"));
		System.out.println("printClassFields():");
		printClassFields(Class.forName("TypeInfo.FancyToy"));
	}
}
