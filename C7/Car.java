package C7;

class Engine {
	public void start() {}    //引擎 
	public void rev() {}       //加速
	public void stop() {}      
}

class Wheel {
	public void inflate(int psi) {}  //充气 参数气压
}

class Window {
	public void rollup() {}
	public void rolldown() {}
}

class Door {
	public Window window = new Window();
	public void open() {}
	public void close() {}
}

public class Car {
	public Engine eg  = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(), right = new Door();
	public Car() {
		for (int i = 0; i < 4; i++) {
			wheel[i] = new Wheel();
		}
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(66);
	}
}