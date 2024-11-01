/*Write a Java program that creates a class hierarchy for employees of a company.
 *  The base class should be Employee, with subclasses Manager, Developer, and Programmer. 
 *  Each subclass should have properties such as name, address, salary, and job title. 
 *  Implement methods for calculating bonuses, generating performance reports, and managing projects. 
*/
package module;
import java.util.*;
class Employee {
		String name;
		String address;
		float salary;
		String jobtitle;
	Employee(String name,String address,float salary ,String jobtitle){
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.jobtitle=jobtitle;
		}
	void printdetails() {
		System.out.println("The name of the employee is "+name);
		System.out.println("The Address of the employee is "+address);
		System.out.println("The salary of the employee is "+salary);
		System.out.println("The jobtitle of the employee is "+jobtitle);
	}
}
class Manager extends Employee{
	float salary,newsalary;
	String department;
	String Projects;
	Manager(String name,String address,float salary ,String jobtitle,String department,String Projects){
		super( name,address,salary,jobtitle);	
		this.salary=salary;
		this.department=department;
		this.Projects=Projects;
	}
	void bonus() {
		newsalary=(float)((12.0/100.0)*salary)+salary;
		System.out.println("The bonus iin salary is 12% ");
		System.out.println("Salary credited: "+newsalary);
	}
	void printdep() {
		System.out.println("The  Department is "+department);
		System.out.println("Working Projects : "+Projects);
	}
}
class Developer extends Employee{
	float salary,newsalary;
	String specilization;
	String Projects;
	Developer(String name,String address,float salary ,String jobtitle,String specializations,String Projects){
		super( name,address,salary,jobtitle);	
		this.salary=salary;
		this.specilization=specializations;
		this.Projects=Projects;
	}
	void bonus() {
		newsalary=(float)((9.0/100.0)*salary)+salary;
		System.out.println("The bonus iin salary is 9% ");
		System.out.println("Salary credited: "+newsalary);
	}
	void printdep() {
		System.out.println("Under the  Department of "+specilization);
		System.out.println("Working Projects : "+Projects);
	}
}

class Programmer extends Employee{
	float salary,newsalary;
	String specilization;
	String Projects;
	Programmer(String name,String address,float salary ,String jobtitle,String specializations,String Projects){
		super( name,address,salary,jobtitle);	
		this.salary=salary;
		this.specilization=specializations;
		this.Projects=Projects;
	}
	void bonus() {
		newsalary=(float)((6.0/100.0)*salary)+salary;
		System.out.println("The bonus iin salary is 6% ");
		System.out.println("Salary credited: "+newsalary);
	}
	void printdep() {
		System.out.println("Under which crew: "+specilization);
		System.out.println("Working Projects : "+Projects);
	}
}

public class inheritanceEmployee {
	public static void main(String[] args) {
		//1 for manager; 2 for developer; 3 for programmer
		String name1,name2,name3;
		String address1,address2,address3;
		float salary1,salary2,salary3 ;
		String jobtitle1,jobtitle2,jobtitle3;
		String department;
		String projects1,projects2,projects3;
		String specialization2,specialization3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the details of the 1st Employee:");
		System.out.println(" Name:");
		name1=sc.next();
		System.out.println("Addess:");
		address1=sc.next();
		System.out.println("Salay:");
		salary1=sc.nextFloat();
		System.out.println("Jobtitle");
		jobtitle1=sc.next();
		System.out.println("Department:");
		department=sc.next();
		System.out.println("Projects involved");
		projects1=sc.next();
		Manager manager=new Manager(name1,address1,salary1,jobtitle1,department,projects1);
		//developer
		System.out.println();
		System.out.println("Ente the details of 2nd Employee:");
		System.out.println(" Name:");
		name2=sc.next();
		System.out.println("Addess:");
		address2=sc.next();
		System.out.println("Salay:");
		salary2=sc.nextFloat();
		System.out.println("Jobtitle");
		jobtitle2=sc.next();
		System.out.println("Specialization:");
		specialization2=sc.next();
		System.out.println("Projects involved");
		projects2=sc.next();
		Developer developer=new Developer(name2,address2,salary2,jobtitle2,specialization2,projects2);
		System.out.println();
		//programmmer
		System.out.println("Ente the details of 3rd Employee:");
		System.out.println(" Name:");
		name3=sc.next();
		System.out.println("Addess:");
		address3=sc.next();
		System.out.println("Salay:");
		salary3=sc.nextFloat();
		System.out.println("Jobtitle");
		jobtitle3=sc.next();
		System.out.println("Specialization:");
		specialization3=sc.next();
		System.out.println("Projects involved");
		projects3=sc.next();
		Programmer programmer=new Programmer(name3,address3,salary3,jobtitle3,specialization3,projects3);
		System.out.println();
		//output printing
		System.out.println("----------------------------------------------------------");
		System.out.println("                 Details of Manager               ");
		System.out.println();
		manager.printdetails();
		manager.bonus();
		manager.printdep();
		System.out.println();
		System.out.println();
		System.out.println("                 Details of Developer               ");
		System.out.println();
		developer.printdetails();
		developer.bonus();
		developer.printdep();
		System.out.println();
		System.out.println();
		System.out.println("                 Details of Programmer");
		System.out.println();
		programmer.printdetails();
		programmer.bonus();
		programmer.printdep();
		
	}
}
