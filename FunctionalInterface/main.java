package FunctionalInterface;
/*
An Interface that contains exactly one abstract method is known as functional interface. 
it can have any number of default, static methods but can contain only one abstract method.
It can also declare methods of object class.
Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
It is a new feature in Java, which helps to achieve functional programming approach.
*/

@FunctionalInterface  
interface sayable{  
    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  
public class main implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        main fie = new main();  
        fie.say("Hello there");  
    }  
}  