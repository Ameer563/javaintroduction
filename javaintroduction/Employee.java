package javaintroduction;

public class Employee {
      static String departmentName;
      static String location;
      int employeeID;
	  String name;
	  String mobile;
	  String email;
	public static void main(String[] args) {
		System.out.println("Employee Details");
		
		System.out.println("========employee1 details==========");
		Employee std1=new Employee();
		departmentName= "Cse";
		location="guntur";
		std1.employeeID=101;
		std1.name="Ameer";
		std1.mobile="6304928385";
		std1.email="ameer@gmail.com";
		System.out.println(departmentName);
		System.out.println(location);
		System.out.println("Name:"+ std1.name);
		System.out.println("Mobile:"+ std1.mobile);
		System.out.println("Email:"+ std1.email);
		
 
		System.out.println("========employee2 details==========");
		Employee std2=new Employee();
		std2.employeeID=102;
		std2.name="Anirudh";
		std2.mobile="928347568";
		std2.email="anirudh@gmail.com";
		System.out.println(departmentName);
		System.out.println(location);
		System.out.println("Name:"+ std2.name);
		System.out.println("Mobile:"+ std2.mobile);
		System.out.println("Email:"+ std2.email);
		
		System.out.println("========employee3 details==========");
		Employee std3=new Employee();
		std3.employeeID=103;
		std3.name="kittu";
		std3.mobile="9391409165";
		std3.email="kittu@gmail.com";
		System.out.println(departmentName);
		System.out.println(location);
		System.out.println("Name:"+ std3.name);
		System.out.println("Mobile:"+ std3.mobile);
		System.out.println("Email:"+ std3.email);
		
		System.out.println("========employee4 details==========");
		Employee std4=new Employee();
		departmentName= "Ece";
		location="Hyderbad";
		std4.employeeID=104;
		std4.name="Charan";
		std4.mobile="8328230283";
		std4.email="charan@gmail.com";
		System.out.println(departmentName);
		System.out.println(location);
		System.out.println("Name:"+ std4.name);
		System.out.println("Mobile:"+ std4.mobile);
		System.out.println("Email:"+ std4.email);
		
		System.out.println("========employee5 details==========");
		Employee std5=new Employee();
		std5.employeeID=101;
		std5.name="Ameer";
		std5.mobile="6304928385";
		std5.email="ameer@gmail.com";
		System.out.println(departmentName);
		System.out.println(location);
		System.out.println("Name:"+ std5.name);
		System.out.println("Mobile:"+ std5.mobile);
		System.out.println("Email:"+ std5.email);
		
		System.out.println("========employee6 details==========");
		Employee std6=new Employee();
		departmentName= "Cse";
		location="guntur";
		std6.employeeID=101;
		std6.name="Ameer";
		std6.mobile="6304928385";
		std6.email="ameer@gmail.com";
		System.out.println(departmentName);
		System.out.println(location);
		System.out.println("Name:"+ std6.name);
		System.out.println("Mobile:"+ std6.mobile);
		System.out.println("Email:"+ std6.email);
		
	}

}
