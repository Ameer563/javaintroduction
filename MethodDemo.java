
public class MethodDemo {
	static void method1() {
		System.out.println("method1 called");
		MethodDemo m=new MethodDemo();
		m.method2();
		m.method4();
	}
	void method2()
	{
		System.out.println("method2 called");
		method3();
	}
	static void method3() {
		System.out.println("method3 called");
		
	}
	void method4()
	{
		System.out.println("method4 called");
		method5();
		method6();
	}
	static void method5() {
		System.out.println("method5 called");
	}
	void method6()
	{
		System.out.println("method6 called");
	}

	public static void main(String[] args) {
		
System.out.println("main method executed");
method1();
	}

}
