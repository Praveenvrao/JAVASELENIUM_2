package DAY11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSet_1 {

	public static void main(String[] args) {
		
		Set<Object> set1 = new HashSet<>();
		
		System.out.println(set1);
		System.out.println();
		//Adding values into set
		
		System.out.println("Adding values into Set .........");
		set1.add(199);
		set1.add("SET1");
		set1.add('S');
		set1.add(false);
		set1.add(false);
		set1.add(null);
		set1.add(null);
		
		System.out.println(set1);
		
		//To get any value from set we should convert Arraylist
		System.out.println();
		System.out.println("To call specific value we should call by converting to ARRAYLIST ......");
		
		ArrayList<Object> as = new ArrayList<Object>(set1);
		System.out.println(as);
		System.out.println("Now call by index value");
		System.out.println(as.get(4));

	}

}
