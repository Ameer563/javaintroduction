package languagefundamentals.src.languagefundamentals;

public class ConstructorchainingEmp {
	String empId;
	String empname;
	double salary;
	ConstructorchainingEmp(String empId,String empname,double salary){
		this.empId=empId;
		this.empname=empname;
		this.salary=salary;
	}
	ConstructorchainingEmp(){
		this("E101","Anirudh",40000);
	}

	public static void main(String[] args) {
		ConstructorchainingEmp c1=new ConstructorchainingEmp();
		c1.display();
		

	}
	void display() {
		System.out.println("*********Employee details************");
		System.out.println("Employee Id="+empId);
		System.out.println("Employee Name="+empname);
		System.out.println("Salary="+salary);
	}

}
