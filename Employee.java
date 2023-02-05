import java.io.*;

public class Employee{

	// This instance varialbe is visible for any child class.
	public String name;

	int age;



	String designation;
	//salary variable is visible in Employee class only.
	private double salary;

	// This is the constructor of the class Employee
	public Employee(String name){
		this.name = name;
	}

	// Assign the age of the Employee to the variable age.
	public void empAge(int empAge){
		age = empAge;
	}

	/* Assign the designation to the variable designation. */
	public void empDesignation(String empDesign)
	{
		designation = empDesign;
	}

	/* Assign the salary to the variable salary. */
	public void empSalary(double empSalary){
		salary = empSalary;
	}

	public void setSalary(double empSal){
		salary = empSal;
	}

	public void printEmp(){
		System.out.println("Name : " + name);
		System.out.println("salary : " + salary);
	}

	/* Print the Employee details */
	public void printEmployee(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}

	public static final String dep = "Development";

	public static void main(String args[]){
		Employee empOne = new Employee("Ransika");
		empOne.setSalary(1000);
		empOne.printEmp();
		System.out.println(dep);
	}
}
