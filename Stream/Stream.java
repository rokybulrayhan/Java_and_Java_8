package Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
	public static void main( String[] args )
    {
        List<Product> plist = new ArrayList<Product>();
        plist.add(new Product(1,"Samsung",25000f));
        plist.add(new Product(2,"Nokia",20000f));
        plist.add(new Product(3,"Apple",30000f));
        plist.add(new Product(4,"Sony",22000f));
        plist.add(new Product(5,"Mi",12000f));
        plist.add(new Product(6,"Huawei",15000f));
        
        //using stream printing list without using for loop  or iterator 
        plist.stream().forEach(product->System.out.println(product));
        
        //compact approach for filtering data
        plist.stream().filter(product->product.getpPrice()==30000).forEach(product->System.out.println(product.getpName()));
        
        //filtering data and also convert into set
        List<Float> plist1 = plist.stream()
        		.filter(p->p.getpPrice()>20000) //filtering data
        		.map(p->p.getpPrice()) //fetching price
        		.collect(Collectors.toList()); // collecting as list
        System.out.println(plist1);
        
        // More precise code - sum of prices
        Float plist2 = plist.stream().map(p->p.getpPrice()).reduce(0.0f,Float::sum); //accumulating price, by referring method of float class
        System.out.println(plist2);
        
        // Using Collectors's method - sum of prices.
        double plist3 = plist.stream().collect(Collectors.summingDouble(p->p.getpPrice()));
        System.out.println(plist3);
        
        // count number of product based on filter
        long count = plist.stream().filter(p->p.getpPrice()>15000).count();
        System.out.println("Total Number of Filtered Product is: "+count);
        
        // count total number of product
        long count1 = plist.stream().count();
        System.out.println("Total Number of Product is: "+count1);
        
        Product Max = plist.stream().max((p1,p2)->p1.getpPrice()>p2.getpPrice()?1:-1).get();
        Product Min = plist.stream().max((p1,p2)->p1.getpPrice()<p2.getpPrice()?1:-1).get();
        System.out.println(Max.getpName() + " has highest Price of Phone And Price is: "+Max.getpPrice());
        System.out.println(Min.getpName() + " has lowest Price of Phone And Price is: "+Min.getpPrice());
    }
}
