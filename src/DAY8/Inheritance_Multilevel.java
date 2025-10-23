package DAY8;

class A1{
	void m1(int a, int b) {
		System.out.println(a*b);
	}
}

class A2 extends A1{
	void m2(int a, int b) {
		System.out.println((a+b)*10);
	}
}
class B1 extends A1{
	int m3(int a, int b) {
		return (a-b);
	}
}

public class Inheritance_Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B1 obj1 = new B1();
		obj1.m1(20, 50);
		System.out.println(obj1.m3(40, 5));
		
		A2 obj2 = new A2();
		obj2.m1(20, 50);
		obj2.m2(3, 8);

	}

}
