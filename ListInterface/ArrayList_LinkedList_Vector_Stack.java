package ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


public class ArrayList_LinkedList_Vector_Stack {

	public static void main(String[] args) {
		
		/*
		 * ------ArrayList Vs LinkedList--------
		1) ArrayList internally uses a dynamic array to store the elements.	
          LinkedList internally uses a doubly linked list to store the elements.
	    2) Manipulation with ArrayList is slow because it internally uses an array.If any element is removed from the array, all the bits are shifted in memory.	
          Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
	    3) An ArrayList class can act as a list only because it implements List only.	
           LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
	    4) ArrayList is better for storing and accessing data.	
           LinkedList is better for manipulating data.
          */
		List<String> list = new ArrayList();
		System.out.println("ArrayList: ");
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		list.remove(2);
		System.out.println(list);
		List<String> list1 = new LinkedList();
		System.out.println("LinkedList: ");
		list1.add("Ravi");//Adding object in arraylist  
		list1.add("Vijay");  
		list1.add("Ravi");  
		list1.add("Ajay"); 
		System.out.println(list);
		
		List<String> list2 = new Vector();
		System.out.println("vector :");
		list2.add("Ravi");//Adding object in arraylist  
		list2.add("Vijay");  
		list2.add("Ravi");  
		list2.add("Ajay");
		System.out.println(list2);
		
		//----vector vs ArrayList
		List<String> list3 = new Stack();
		System.out.println("Stack :");
		list3.add("Ravi");//Adding object in arraylist  
		list3.add("Vijay");  
		list3.add("Ravi");  
		list3.add("Ajay");
		System.out.println(list3);
	   /* ------stack-------
	    It follows LIFO (Last in first out) mechanism.
	    It is the stack implementation in java
		
	    public class StackDemo {

		    public static void main(String[] args) {

		    //CREATION
		        Stack st = new Stack();

		    //PUSH   
		        // Insertion by push method                 
		        st.push(25);      
		        st.push("java");  
		        st.push(true);    

		    //PEEK
		        System.out.println(st.peek());

		    //POP
		        while(!st.empty()){
		            System.out.println("Element: "+st.pop());
		        }
		    }
		}
		Output:

		=========================

		Stack contents [25, java, true]

		true

		Element: true

		Element: java

		Element: 25
		*/
		
		
		
		
		
		

	}

}
