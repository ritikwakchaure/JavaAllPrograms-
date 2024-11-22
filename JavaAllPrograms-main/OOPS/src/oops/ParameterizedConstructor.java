package oops;
class Student1{  
	
    int id;  
    String name;  
    //creating a parameterized constructor  
    Student1(int i,String n)
    {  
    	id = i;  
    	name = n;  
    }  
    //method to display the values  
    void display()
    {
    	System.out.println(id+" "+name);
    	 
    }
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		
	    Student1 s1 = new Student1(111,"Karan");  
	    Student1  s2 = new Student1(222,"Aryan"); 
	    s1.display();  
	    s2.display(); 
	}

}
