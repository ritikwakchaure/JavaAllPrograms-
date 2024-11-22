package oops;

class Animal6 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog6 extends Animal6 {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}

public class SuperKeywordMethod {

	public static void main(String[] args) {
		Dog6 d = new Dog6();
		d.work();

	}

}
