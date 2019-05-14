package AbstractClass;
//interface supported multiple inheritance
//-----interface--- 
//-can only abstract method
//it is support multiple inheritance
//can only have static and final varriable
//Fully abstruct
//EX:interface animal{
//void eat();}
//------abstract------
//can have abstract non abstract
//it doesn't support multiple inheritance
//can have static ,non static ,final and non final varriable
//we can't create an object for this class.
/*abstract class Base {    
    void fun() { System.out.println("Base fun() called"); } 
} 
   
class Derived extends Base { } 
   
class Main { 
    public static void main(String args[]) {  
        Derived d = new Derived(); 
        d.fun(); 
    } 
} */
//Ex: abstraction class animal{
//abstract void eat();}

/*
 * abstract class Base { abstract void fun(); } class Derived extends Base {
 * void fun() { System.out.println("Derived fun() called");} } class Main {
 * public static void main(String args[]) {
 * 
 * // Uncommenting the following line will cause compiler error as the // line
 * tries to create an instance of abstract class. // Base b = new Base(); // We
 * can have references of Base type. Base b = new Derived(); b.fun(); } }
 */
abstract class Figure {
	  double dim1;

	  double dim2;

	  Figure(double a, double b) {
	    dim1 = a;
	    dim2 = b;
	  }

	  abstract double area();
	}

	class Rectangle extends Figure {
	  Rectangle(double a, double b) {
	    super(a, b);
	  }

	  double area() {
	    System.out.println("Inside Area for Rectangle.");
	    return dim1 * dim2;
	  }
	}

	class Triangle extends Figure {
	  Triangle(double a, double b) {
	    super(a, b);
	  }

	  double area() {
	    System.out.println("Inside Area for Triangle.");
	    return dim1 * dim2 / 2;
	  }
	}

	class Main {
	  public static void main(String args[]) {
	    Rectangle r = new Rectangle(9, 5);
	    Triangle t = new Triangle(10, 8);
	    Figure figref;

	    figref = r;
	    System.out.println("Area is " + figref.area());

	    figref = t;
	    System.out.println("Area is " + figref.area());
	  }
	}