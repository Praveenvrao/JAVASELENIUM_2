package DAY10;

class Animal {
	void AnimalMethod() {
		System.out.println("This is ANIMAL Method");
	}
}

class Dog extends Animal{}
class Cat extends Animal{
	void Catmethod() {
		System.out.println("This is cat method");

	}
}

public class Typecasting_Nonpremetive {

	public static void main(String[] args) throws Exception{
		
		/*Animal an = new Animal();
		Dog dg = (Cat) an; */  //Rule 2 is fail
		
		//Rule 1 - conversion relation 
		// Rule 2 is assignment 
		// Rule 3 is underlying object of d should be eiether same or child of C
		
		/*Animal an = new Cat();
		Dog dg = (Dog) an; */ // Rule 3 is fail
		
		Animal an = new Cat();
		an.AnimalMethod();
		Cat ct = (Cat) an;
		ct.Catmethod();
		ct.AnimalMethod();

	}

}
