package oops;

abstract class Bike5 {
	abstract void run();
}

class Honda4 extends Bike5 {
	void run() {
		System.out.println("running safely");
	}
}
public class Abstraction{
	public static void main(String args[]) {
		Bike5 obj = new Honda4();
		obj.run();
	}
}
