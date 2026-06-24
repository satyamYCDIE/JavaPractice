package OOPsConcept;

public class studentMain {

	public static void main(String[] args) 
	{
		Student stu1=new Student();
		stu1.sid=1;
		stu1.sname="Ankit";
		stu1.grade='A';
		stu1.favsub="Math";
		stu1.prinData();

		Student stu2=new Student();
		stu2.sid=2;
		stu2.sname="Avi";
		stu2.grade='A';
		stu2.favsub="Science";
		stu2.prinData();
	}

}
