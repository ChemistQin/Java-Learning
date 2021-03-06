package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 数组和泛型容器进行对比
 * 两者持有对象的方式都是检查类型的
 * 唯一明显差异在于数组使用【】来访问元素，而List使用的是add()和get()这样的方法
 */

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;
	@Override
	public String toString() {
		return "Sphere " + id;
	}
}

public class ContainerComparison {
	public static void main(String[] args) {
		BerylliumSphere[] spheres = new BerylliumSphere[10];
		for (int i = 0; i < 5; i++) {
			spheres[i] = new BerylliumSphere();
		}
		System.out.println(Arrays.toString(spheres));
		System.out.println(spheres[4]);
		
		List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
		for (int i = 0; i < 5; i++) {
			sphereList.add(new BerylliumSphere());
		}
		System.out.println(sphereList);
		System.out.println(sphereList.get(4));
		
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4,5));
		intList.add(109);
		System.out.println(intList);
		System.out.println(intList.get(4));
		
	}
}
