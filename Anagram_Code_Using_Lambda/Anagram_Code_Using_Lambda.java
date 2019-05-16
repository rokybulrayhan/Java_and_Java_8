package Anagram_Code_Using_Lambda;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Code_Using_Lambda {

	public static void main(String[] args) {
		Anagram_Code_Using_Lambda anagram = new Anagram_Code_Using_Lambda();
		anagramOperation anagram_obj = (char [] a,char[] b) -> anagram(a,b);
        char[] a = {'s','i','r'};
        char[] b = {'i','r','s'};
		int i,j;
		
		boolean pag = anagram_obj.operation(a,b);
		System.out.println(pag);
		
	}

	interface anagramOperation {
		boolean operation(char s1[],char s2[]);

	}

    static boolean anagram(char s1[],char s2[]) {
         Arrays.sort(s1);
         Arrays.sort(s2);
         int i,j;
         if(s1.length!=s2.length) {
        	 System.exit(0);
         }
         for(i=0;i<s1.length;i++) {
        	 if(s1[i]!=s2[i]) {
        		 return false;
        	 }
         }
         return true;
	}

}