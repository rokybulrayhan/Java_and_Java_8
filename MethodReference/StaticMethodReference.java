package MethodReference;

interface hi{  
    void say();  
}  
public class StaticMethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        hi sayable = StaticMethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  