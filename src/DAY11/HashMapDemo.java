package DAY11;
import java.util.HashMap;

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
		
		//to remove specific value pair
		System.out.println();
		

	}

}
