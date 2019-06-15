package FunctionalInterface;

/*
 * It is a functional interface which represents a predicate (boolean-valued function) of one argument.
 * It is defined in the java.util.function package and contains test() a functional method.
 */

import java.util.function.Predicate;  
public class PredicateInterface {  
    static Boolean checkAge(int age){  
        if(age>19)  
            return true;  
        else return false;  
    }  
    public static void main(String[] args){  
        // Using Predicate interface  
        Predicate<Integer> predicate =  PredicateInterface ::checkAge;  
        // Calling Predicate method  
        boolean result = predicate.test(25);  
        System.out.println(result);  
    }  
}  
//output -- true
