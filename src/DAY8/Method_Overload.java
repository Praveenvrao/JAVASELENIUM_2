package DAY8;

public class Method_Overload {
	
	int a = 77;
	int b = 66;
	
	Method_Overload() {
		// TODO Auto-generated constructor stub
		int a = 100;
		int b = 55;
	}
	Method_Overload(int a1, int b1){
		a = a1;
		b = b1;
	}
	Method_Overload(int a2, double b2){
		a = a2;
		b = (int) b2;
	}
	Method_Overload(double a3, double b3){
		a = (int) a3;
		b = (int) b3;
	}
	Method_Overload(double a4, int b4){
		a = (int) a4;
		b = b4;
	}
	
	void m1() {
		System.out.println(a+b);
	}
	double m1(double p, double q) {
		return (p+q);
	}
	int m1(int p, int q) {
		return (a+b);
	}
	void m1(int a, double b) {
		System.out.println(a*b);
	}
	void m1(double a, int b) {
		System.out.println(a-b);
	}

}
