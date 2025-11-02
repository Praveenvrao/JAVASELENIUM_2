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
		

	}

}
