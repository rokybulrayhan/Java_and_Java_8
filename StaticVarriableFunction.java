
public class StaticVarriableFunction {

	public static void main(String[] args) {
		//kono object create kora lage na direct onno class er access paowa jai
        System.out.println("Varrible :"+StaticVarriable.variable);
        StaticFunction.add();
	}

}

class StaticFunction{
	public static void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Static Function"+c);
	}
}

class StaticVarriable{
	static int variable = 10;
}