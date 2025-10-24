package DAY8;

class PARENT {
	
	String method1(String S1, String S2) {
		return ("This is Parent Method with S1 & S2 which are " + S1 + S2);
	}
}
class Child1 extends PARENT {
	void childmethod1(String ch1) {
		System.out.println("Child name is -> " + ch1);
	}
}
class Child2 extends PARENT {
	void childmethod2(String ch2) {
		System.out.println("Child 2 name is -> " + ch2);
	}
}

public class Inheritance_Hiriercy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PARENT P1 = new PARENT();
		System.out.println(P1.method1("RAJ", "MRUNAL"));
		Child1 obj1 = new Child1();
		System.out.println(obj1.method1("MARK C", "MARK B"));
		obj1.childmethod1("Andrew");
		Child2 obj2 = new Child2();
		obj2.childmethod2("Amith");
		System.out.println(obj2.method1("DAVID BEAN", "NAT"));
		

	}

}
