package languagefundamentals.src.languagefundamentals;
import java.util.Scanner;
public class EmployeeDetails {
	
	String empname;
	double salary;
	static String companyname="Vcube";
	
	void display() {
		System.out.println("Employee Name="+empname);
		System.out.println("Salary="+salary);
		System.out.println("Company name="+companyname);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeDetails e1=new EmployeeDetails(); 
		System.out.println("Enter Employee name=");
		 e1.empname=sc.next();
		 System.out.println("Enter salary=");
		 e1.salary=sc.nextDouble();
		 System.out.println("******Employee Details**********");
		 e1.display();
		

	}

}
