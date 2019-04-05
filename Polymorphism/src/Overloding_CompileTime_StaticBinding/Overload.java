package Overloding_CompileTime_StaticBinding;

public class Overload {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void add() {
		System.out.println("Nothing");
	}

}
