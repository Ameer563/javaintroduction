package javaintroduction.javaintroduction;

public class EmployeeDetails { 
	String empId;
	String empName;
	int salary;
	int experience;
	char grade;
	boolean permanentStatus;
	 static int count;
	
	static {
		System.out.println("Employee Details in XYZ Company");
	}
	
	{
		
		count++;
	}
	
	void display()
	{
		System.out.println("============Employee"+count+" Details==========");
		System.out.println("Employee ID="+empId);
		System.out.println("Employee Name="+empName);
		System.out.println("Salary="+salary+"INR");
		System.out.println("Experience="+experience+"Years");
		System.out.println("Grade="+grade);
		System.out.println("Permanent Status="+permanentStatus);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails e1=new EmployeeDetails();
		e1.empId="E101";
		e1.empName="Anirudh";
		e1.salary=35000;
		e1.experience=3;
		e1.grade='A';
		e1.permanentStatus=true;
		e1.display();
		
		EmployeeDetails e2=new EmployeeDetails();
		e2.empId="E102";
		e2.empName="Kittu";
		e2.salary=35000;
		e2.experience=1;
		e2.grade='B';
		e2.permanentStatus=true;
		e2.display();
		
		EmployeeDetails e3=new EmployeeDetails();
		e3.empId="E103";
		e3.empName="Ameer";
		e3.salary=25000;
		e3.experience=0;
		e3.grade='C';
		e3.permanentStatus=false;
		e3.display();



	}

}
