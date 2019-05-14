package Interface;
//interface supported multiple inheritance
//-----interface--- 
//-can only abstract method
//it is support multiple inheritance
//can only have static and final varriable
//Fully abstruct
//EX:interface animal{
// void eat();}
//------abstract------
//can have abstract non abstract
//it doesn't support multiple inheritance
//can have static ,non static ,final and non final varriable
//Ex: abstraction class animal{
// abstract void eat();}


/*
 * interface in1 //interface er jaigai abstact dile wrong dekhai (mane abstarct
 * class object //er object create kora jai na { final int a = 10; default void
 * display() { System.out.println("hello"); } }
 * 
 * // A class that implements interface. class Main implements in1 { // Driver
 * Code public static void main (String[] args) { Main t = new Main();
 * t.display(); } }
 */
import java.io.*; 

interface Vehicle { 
      
    // all are the abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 
  
class Bicycle implements Vehicle{ 
      
    int speed; 
    int gear; 
    @Override
    public void changeGear(int newGear){ 
          
        gear = newGear; 
    } 
    @Override
    public void speedUp(int increment){ 
          
        speed = speed + increment; 
    } 
    @Override
    public void applyBrakes(int decrement){ 
          
        speed = speed - decrement; 
    } 
      
    public void printStates() { 
         System.out.println("speed: " + speed 
              + " gear: " + gear); 
    } 
} 
  
class Bike implements Vehicle { 
      
    int speed; 
    int gear; 
    @Override
    public void changeGear(int newGear){ 
          
        gear = newGear; 
    } 
    @Override
    public void speedUp(int increment){ 
          
        speed = speed + increment; 
    } 
    @Override
    public void applyBrakes(int decrement){ 
          
        speed = speed - decrement; 
    } 
      
    public void printStates() { 
         System.out.println("speed: " + speed 
             + " gear: " + gear); 
    } 
      
} 
class Main { 
      
    public static void main (String[] args) { 
        Bicycle bicycle = new Bicycle(); 
        bicycle.changeGear(2); 
        bicycle.speedUp(3); 
        bicycle.applyBrakes(1); 
          
        System.out.println("Bicycle present state :"); 
        bicycle.printStates();  
        Bike bike = new Bike(); 
        bike.changeGear(1); 
        bike.speedUp(4); 
        bike.applyBrakes(3); 
          
        System.out.println("Bike present state :"); 
        bike.printStates(); 
    } 
} 

