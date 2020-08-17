import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Emp.Employee;
 class Emp{
	int employeId;
	String employename;
	String empDesignation;
	int empsalary;
	String emplocation;
	String name()
	{
		return employename;
	}
	int Id() {
		return employeId; 
	}
	String Designation() {
		return empDesignation; 
	}
	int Salary() {
		return empsalary; 
	}
	String Location() {
		return emplocation; 
	}
	
	public void get()
	{
		Scanner sb = new Scanner(System.in);
		System.out.print("Enter empId          = ");
		employeId = sb.nextInt();
		System.out.print("Enter empSalary      = ");
		empsalary = sb.nextInt();
		sb.nextLine();
		System.out.print("Enter empName        = ");
		employename = sb.nextLine();
		System.out.print("Enter empDesignation = ");
		empDesignation = sb.nextLine();
		System.out.print("Enter empLocation    = ");
		emplocation = sb.nextLine();
    }

}
 public class Employeinfo extends Emp {
		public static void main(String [] args)
		{
			List<Employeinfo> emp = new ArrayList<Employeinfo>();

			for(int i=0;i<5;i++)
			{
				Employeinfo take = new Employeinfo();
				take.get();
				emp.add(take);
			}

			System.out.println("Names of the emp's are\n");
			emp.forEach(take-> System.out.println(take.name()));
			System.out.println("\nSalaries greater than 5000\n");
			emp.stream().map(take->take.Salary()).filter(n->n>5000).forEach(System.out::println);
			System.out.println("\nLocations starting with ");
			emp.stream().map(take->take.Location()).filter(s->s.charAt(0)=='M').forEach(System.out::println);
			System.out.println("\nDesignations ending with E");
	        emp.stream().map(take->take.Designation()).filter(s->s.charAt(s.length()-1)=='E').forEach(System.out::println);


		}
		
	}

