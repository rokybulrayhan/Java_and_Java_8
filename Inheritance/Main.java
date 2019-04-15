package Inheritance;

import java.util.*; 
import java.lang.*; 
import java.io.*; 
class one 
{ 
    public void print_for1() 
    { 
        System.out.println("Rokybul"); 
    } 
} 
  
class two extends one 
{ 
    public void print_for2() 
    { 
        System.out.println("Rayhan"); 
    } 
} 
class three extends two 
{ 
    public void print_for3() 
    { 
        System.out.println("Chowdhury"); 
    } 
} 
public class Main 
{ 
    public static void main(String[] args) 
    { 
        three g = new three(); 
        g.print_for1(); 
        g.print_for2(); 
        g.print_for3(); 
        g.print_for1();
    } 
} 

