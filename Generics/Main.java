package Generics;
// type casting
//type safety
class student<T> { //generics class
	   private T t;

	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }
}
class GenerisMethod{
	   public static <E> void printArrays(E [] inputArray) {
		   for(E element : inputArray) {
			   System.out.printf("%s",element); //Generics Method
		   }
		   System.out.println();
	   }
}

public class Main {
	
   public static void main(String[] args) {
	    System.out.println("------generics method-----");
	    GenerisMethod g = new GenerisMethod();
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.1,4.1};
		Character[] charArray = {'A','B','C'};
		System.out.println();
		System.out.println("integers are ");
		g.printArrays(intArray);
		System.out.println("Doubles are :");
		g.printArrays(doubleArray);
		System.out.println("Characters are :");
		g.printArrays(charArray);
		System.out.println("------generics class-----");
		student<Integer> intStudent = new student<Integer>();
	    student<String> strinStudent = new student<String>();
	    intStudent.add(new Integer(10));
	    strinStudent.add(new String("Hello World"));
        System.out.println("Integer Value "+intStudent.get());
	    System.out.printf("String Value :%s\n", strinStudent.get());
        
	}



}
