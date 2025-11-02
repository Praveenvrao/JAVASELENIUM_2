package DAY11;

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

	}

}
