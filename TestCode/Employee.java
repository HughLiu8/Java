import java.io.*;

public class Employee{

   String name;
   int age;
   String designation;
   double salary;
   
   public static int nTest;
	
   // This is the constructor of the class Employee
   public Employee(String name){
      this.name = name;
   }
   // Assign the age of the Employee  to the variable age.
   public void empAge(int empAge){
      age =  empAge;
   }
   /* Assign the designation to the variable designation.*/
   public void empDesignation(String empDesig){
      designation = empDesig;
   }
   /* Assign the salary to the variable	salary.*/
   public void empSalary(double empSalary){
      salary = empSalary;
   }
   public int hashCode() {
        int hash = 1;
        hash = hash * 17 + employeeId;
        hash = hash * 31 + name.hashCode();
        hash = hash * 13 + (dept == null ? 0 : dept.hashCode());
        return hash;
    }
   
   /* Print the Employee details */
   public void printEmployee(){
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
	  System.out.println("nTest:" + nTest);
	  
	  String Str = new String("Welcome to Tutorialspoint.com");
      System.out.println("Hashcode for Str :" + Str.hashCode() );
   }
}

class Super
{
	final int fn = 0;
	
	static public void Test()
	{
		int n = 3;
	}
}

class sub extends Super
{

}