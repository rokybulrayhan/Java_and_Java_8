package Random_Number;
import java.util.Random;
import java.util.Scanner;
//buzchi 
public class Main
{
    public static void main( String[] args )
    {
    	int cnt=0;
    	Random rand = new Random(); 
    	int value = rand.nextInt(10); 
    	System.out.println(value);
    	System.out.println("Enter number between (1-10) to match");	
    	Scanner scan=new Scanner(System.in);
    	int x=scan.nextInt();
    	int i;
    	for(i=1;i<=10;i++) {
    		cnt++;
    	    if(x>value) {
    		  System.out.println("Your given number is greater than the random one ");
    		  System.out.println("Please enter small number than the previous one");
    		  x = scan.nextInt();
    	  }
    	    else if(x<value) {
    		  System.out.println("Your given number is smaller than the random one ");
    		  System.out.println("Please enter a bigger number than the previous one");
    		  x = scan.nextInt();
    	    }
    		else if(x==value){
    			System.out.println("Your number has matched");
    			break;
    		}
    	  }
    	System.out.println(cnt);
    }
}