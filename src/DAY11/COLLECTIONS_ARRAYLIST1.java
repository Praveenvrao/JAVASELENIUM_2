package DAY11;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class COLLECTIONS_ARRAYLIST1 {

	public static void main(String[] args) {
		
		List<Object> list1 = new ArrayList<Object>();
		System.out.println("The list after creating not added any data");
		System.out.println(list1);
		
		//Adding items in the collection, i am adding heterogeneous data
		
		list1.add(23);
		list1.add("JAVADAY11");
		list1.add('P');
		list1.add(true);
		list1.add(45.3);
		list1.add(true);
		list1.add(null);
		list1.add(null);
		
		//to get all the data in the list
		System.out.println();
		System.out.println("All the items in the list are -> "+ list1);
		
		//to get specific item in the list
		System.out.println();
		System.out.println("Got the specific 2nd element in the list ->"+ list1.get(1));
		
		

	}

}
