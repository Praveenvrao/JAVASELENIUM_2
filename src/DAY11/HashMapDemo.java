package DAY11;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap
		
		//Map hm1 = new HashMap();
		HashMap<Character,String> hm1 = new HashMap<Character,String>();
		
		System.out.println(hm1);
		//Adding key value pairs
		hm1.put('A', "Aman");
		hm1.put('B', "BOB");
		hm1.put('C', "CATH");
		hm1.put('D', "DAN");
		hm1.put('A', "AKASH");
		
		System.out.println(hm1);
		
		//to get specific value by using key
		System.out.println();
		System.out.println(hm1.get('C'));
		
		//to get only keys
		System.out.println("To get only keysets");
		System.out.println(hm1.keySet());
		
		//to get only values
		System.out.println("Below are the only values..");
		System.out.println(hm1.values());
		
		//to get key and values in list
		System.out.println(hm1.entrySet());
		
		//to call all key and values using enhanced for loop
		
		for(Object x : hm1.entrySet()) {
			System.out.println(x);
		}
		
		for(char k : hm1.keySet()) {
			System.out.println(k +"  "+ (hm1.get(k)));
		}
		
		// to call all the values using Iterator
		
		System.out.println();
		System.out.println("Below values got using Iterator.....");
		Iterator<Entry<Character,String>> It1 = hm1.entrySet().iterator();
		while(It1.hasNext()) {
			System.out.println(It1.next());
		}
		
		//to remove specific value pair
		System.out.println();
		

	}

}
