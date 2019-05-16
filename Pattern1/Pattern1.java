package Pattern1;

import java.util.Scanner;

public class Pattern1{

	public static void main(String[] args) {
		int i,j,n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int x=n;
		for(i=1;i<=x;i++) {
			for(j=0;j<n;j++) {
				System.out.print((n+j)+" ");
			}
			n--;
			System.out.println("");
		}
		
	}

}
