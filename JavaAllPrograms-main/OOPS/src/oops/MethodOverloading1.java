package oops;

class Adder4{
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}
}

class MethodOverloading1 {
	public static void main(String[] args) {
		System.out.println(Adder4.add(11, 11));
		System.out.println(Adder4.add(12.3, 12.6));
	}
}