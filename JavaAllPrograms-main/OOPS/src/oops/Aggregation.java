package oops;

 class Emp {
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}
 }
	public class Aggregation{

	public static void main(String[] args) {
		Address address1 = new Address("gzb", "UP", "india");

		Emp e = new Emp(111, "varun", address1);
		
		e.display();
		 

	}
}
