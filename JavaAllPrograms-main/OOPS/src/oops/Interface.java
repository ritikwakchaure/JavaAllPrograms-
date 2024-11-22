package oops;
interface Bomb{
	void blast();
}
interface Goli{
	void fire();
	
}
class Gun implements Bomb,Goli{
	public void blast() {
		System.out.println("blasted...");
	}
	public void fire() {
		System.out.println("firing...");
	}
}
public class Interface {

	public static void main(String[] args) {
		 Gun obj=new Gun();
		 obj.blast();
		 obj.fire();

	}

}
