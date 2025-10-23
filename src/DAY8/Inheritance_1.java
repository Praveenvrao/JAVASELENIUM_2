package DAY8;

class A {
	
	void m1(int a) {
		System.out.println("This is METHOD1 and the a value is " + a);
	}
}

class B extends A {
	int m2(int b){
		return (b);
	}
}

public class Inheritance_1 extends B {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		A obja = new A();
		//obja.m1(12);
		
		B objb = new B();
		objb.m1(23);
		System.out.println(objb.m2(55));

	}

}
