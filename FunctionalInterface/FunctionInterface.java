package FunctionalInterface;
/*
 * It is a functional interface. 
 * It is used to refer method by specifying type of parameter. 
 * It returns a result back to the referred function.
 */

//importing Function interface  
import java.util.function.Function;  
import java.util.List;  
import java.util.ArrayList;  
public class FunctionInterface{  
 static Integer addList(List<Integer> list){  
     return list.stream()  
                .mapToInt(Integer::intValue)  
                .sum();  
 }  
 public static void main(String[] args) {  
     // Creating a list and adding values  
     List<Integer> list = new ArrayList<Integer>();  
     list.add(10);  
     list.add(20);  
     list.add(30);  
     list.add(40);  
     // Referring addList() method  
     Function<List<Integer>, Integer> fun = FunctionInterface::addList;  
     // Calling Function interface method  
     int result = fun.apply(list);  
     System.out.println("Sum of list values: "+result);  
 }  
}  