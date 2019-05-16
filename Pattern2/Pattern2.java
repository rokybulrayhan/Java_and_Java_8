package Pattern2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		int i = 0,j,k,l,x;
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int c=0;
	
		for(i=0;i<n;i++)
		{
		    for(j=n;j>=n-i;j--){
		    	System.out.print(j+" ");
		    }
		    for(j=2;j<=n-i;j++){
		    	System.out.print(n-i+" ");
		    }
		   // System.out.println("");
		    for(k=n-i-1;k>=1;k--){
		    	   System.out.print(n-i+" ");
		    }
		    for(k=n-i+1;k<=n;k++){
		    	   System.out.print(k+" ");
		    }
		    System.out.println("");

        }
		for(i=1;i<n;i++)
		{
			for(k=n;k>=2+i;k--){
		    	  System.out.print(k+" ");
		    }
			for(j=1;j<=i;j++){
			      System.out.print((i+1)+" ");
		    }
			for(j=1;j<=i;j++){
		    	System.out.print((i+1)+" ");
		    }
		    for(k=i+1;k<=n;k++){
		    	   System.out.print(k+" ");
		    }
		    System.out.println("");

        }
		
 }
}