package Overriding_RunTime_DynamicBinding;

public class Main {

	public static void main(String[] args) {
		// If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // show is called 
		Person p = new Person(); //parent class
		p.information(); 
		
		// If a Parent type reference refers 
        // to a Child object Child's show() 
        // is called. This is called RUN TIME 
        // POLYMORPHISM. 
        Person obj2 = new Teacher(); 
        obj2.information(); //Child print hobe
		

	}

}
