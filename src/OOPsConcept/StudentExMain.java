package OOPsConcept;

public class StudentExMain {

	public static void main(String[] args) 
	{
		StudentEx stu1=new StudentEx();
		
		/*stu1.sid=101;
		stu1.sname="Chirag";
		stu1.grade='A';
		stu1.StudentPrint();*/
		
		stu1.setStudentData(102, "Ayushi", 'A');
		stu1.StudentPrint();
	}

}
