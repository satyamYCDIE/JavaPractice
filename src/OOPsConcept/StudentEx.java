package OOPsConcept;

public class StudentEx 
{
	int sid;
	String sname;
	char grade;
	
	void StudentPrint()
	{
		System.out.println(sid+"  "+sname+"  "+grade);
	}
	
	void setStudentData(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grade=gr;
	}
	
	StudentEx (int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grade=gr;
	}
	
	
	
}
