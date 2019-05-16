package Method_Reference_And_Lambda_Basic_Code;

import java.util.Arrays;import java.util.Arrays;
import java.util.List;
//call by value
//call by reference
interface Parse{
	String parse(String str);
}
class StringParse{
	public static String convert (String s) {
		if(s.length()<=5) {
			s=s.toUpperCase(); 
		}
		else {
			s=s.toLowerCase(); //5 er upre gele lower print hobe
		}
		return s;
	}
}
class myPrinter{
	public void print(String str,Parse p) {
		str = p.parse(str);
		System.out.println(str);
	}
}

public class Main {
	public static void main(String args[]) {
		//--- lambda-----
		String str = "TuraGG";
		myPrinter mp = new myPrinter();
		mp.print(str,(s->StringParse.convert(s)));
		//---- method reference---
		StringParse sp = new StringParse();
		String str1 = "Nav";
		//myPrinter mp = new myPrinter();
		mp.print(str,(StringParse::convert));
		
	}
}