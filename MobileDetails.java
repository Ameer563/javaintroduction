
public class MobileDetails {

	 static String brand = "Samsung";
	String mobile ;
	int price;
	int ram ;
	static {
		System.out.println("===========Welcome to out Mobile Showroom===========");
	}

	void method1() {
		
		System.out.println("Brand=" + brand);
		System.out.println("Mobile=" + mobile);
		System.out.println("Price=" + price + "INR");
		System.out.println("Ram=" + ram + "GB");

	}

	{
		System.out.println("============New model arrived==========");
	}

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobileDetails m1 = new MobileDetails();
		m1.mobile="Galaxy M12";
		m1.price=12000;
		m1.ram=6;
		m1.method1();
		MobileDetails m2=new MobileDetails();
		m2.mobile="A16";
		m2.price=16000;
		m2.ram=8;
		m2.method1();
		MobileDetails m3=new MobileDetails();
		m3.mobile="Galaxy M16";
		m3.price=20000;
		m3.ram=8;
		m3.method1();
	}

}
