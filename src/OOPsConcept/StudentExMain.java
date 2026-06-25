package OOPsConcept;

public class StudentExMain {

	public static void main(String[] args) 
	{
		//StudentEx stu=new StudentEx();
		
		//using object reference variable
		/*stu.sid=101;
		stu.sname="Chirag";
		stu.grade='A';
		stu.StudentPrint();*/
		
		//using method
		/*stu.setStudentData(102, "Ayushi", 'A');
		stu.StudentPrint();*/
		
		//using constructor
		StudentEx stu=new StudentEx(103,"Sittu",'A');
		stu.StudentPrint();
	}

}
