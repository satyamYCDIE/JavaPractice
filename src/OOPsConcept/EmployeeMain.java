package OOPsConcept;

public class EmployeeMain {

	public static void main(String[] args) 
	{
			Employee emp1=new Employee();
			emp1.eid=101;
			emp1.ename="Satyam";
			emp1.job="Software Engineer";
			emp1.sal=50000;
			emp1.display();
			
			Employee emp2=new Employee();
			emp2.eid=102;
			emp2.ename="Vishakha";
			emp2.job="Manager";
			emp2.sal=100000;
			emp2.display();

	}

}
