package javaintroduction;
class A{
	B b;
}
class B{
	A a;
}


public class GarbageCollectorDemo {
	
	
	@Override
	protected void finalize() throws Throwable {
	    System.out.println("Object is garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		A obj1 = new A();
		B obj2 = new B();
		obj1.b=obj2;
		obj2.a = obj1;
		
		obj1=null;
		System.gc();
		

	}

}
