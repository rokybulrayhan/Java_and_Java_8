import java.util.LinkedList;

public class Bkash_Paypal_LinkList {

	public static void main(String[] args) {
		String[] bkash= {"B","K","A","S","H"};
		String[] paypal= {"P","A","Y","P","A","L"};
		LinkedList<String> list1 = new LinkedList<String>();
		for(String x: bkash) {
			list1.add(x);
		}
		for(String x: paypal) {
			list1.add(x);
		}
		LinkedList<String> list2 = new LinkedList<String>();
		list2.addAll(list1.subList(3,9));
		list1.subList(3,9).clear();
		System.out.println(list1);
		System.out.println(list2);
		/*
		 * String[] m=list2.toArray(new String[list2.size()]); for(String i:m) {
		 * System.out.println(i); } //m er vitor list2 er pura man ta chole gese
		 */
		

	}

}
