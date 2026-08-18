package javaintroduction.javaintroduction;

public class Atm {
	static int accNumber=100;
	{
		accNumber++;
	}
	static int count=0;
	{
		count++;
	}
	String customerName;
	int balance;
	String status;
	
	void display()
	{
		System.out.println("***************Customer"+count+" Details*************");
		System.out.println("Account Number="+accNumber);
		System.out.println("Customer Name="+customerName);
		System.out.println("Account Balance="+balance+"INR");
		if(balance>1000) {
			System.out.println("Status= Active");
		}
		else {
			System.out.println("Status= Inactive");
		}
	}
	

	public static void main(String[] args) {
		
		Atm a1=new Atm();
		a1.customerName="Anirudh";
		a1.balance=58000;
		a1.display();
		
		Atm a2=new Atm();
		a2.customerName="Kittu";
		a2.balance=42000;
		a2.display();
		
		Atm a3=new Atm();
		a3.customerName="Ameer";
		a3.balance=1000;
		a3.display();
		

	}

}
