package oops;
class Bike3{
	void run() {
		System.out.println("running");
	}
}
class Splendor extends Bike3{
	void run() {
		System.out.println("running safely");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		 Bike3 b=new Splendor();
		 b.run();

	}

}
