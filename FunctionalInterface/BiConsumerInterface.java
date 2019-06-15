package FunctionalInterface;
/*
 * BiConsumer Interface accepts two input arguments and does not return any result.
 * This is the two-arity specialization of Consumer interface. 
 * It provides a functional method accept(Object, Object) to perform custom operations.
 */
import java.util.function.BiConsumer;  
public class BiConsumerInterface{  
    static void ShowDetails(String name, Integer age){  
        System.out.println(name+" "+age);  
    }  
    public static void main(String[] args) {  
        // Referring method  
        BiConsumer<String, Integer> biCon = BiConsumerInterface::ShowDetails;  
        biCon.accept("Rama", 20);  
        biCon.accept("Shyam", 25);  
        // Using lambda expression  
        BiConsumer<String, Integer> biCon2 = (name, age)->System.out.println(name+" "+age);  
        biCon2.accept("Peter", 28);  
    }  
}  