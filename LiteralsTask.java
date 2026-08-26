package javaintroduction;

public class LiteralsTask {
	Integer studentId;
	String studentName;
	Character gender;
	static String collegeName="VLITS";
	String branchName;
	static{ 
		System.out.println("------------Student details------------");
	}
	static Integer count=0;
	{
		count++;
		System.out.println("********Student"+count+"details*************");
	}
	
	void display()
	{
		System.out.println("Student ID="+studentId);
		System.out.println("Student Name="+studentName);
		System.out.println("Student Gender="+gender);		
		System.out.println("College Name="+collegeName);
		System.out.println("Branch Name="+branchName);

	}

	public static void main(String[] args) {
		
		LiteralsTask l1=new LiteralsTask();
		l1.studentId=101;
		l1.studentName="Anirudh";
		l1.gender='M';
		l1.branchName="CSE";
		l1.display();
		
		LiteralsTask l2=new LiteralsTask();
		l2.studentId=102;
		l2.studentName="Ameer";
		l2.gender='M';
		l2.branchName="CSE";
		l2.display();
		

	}

}
