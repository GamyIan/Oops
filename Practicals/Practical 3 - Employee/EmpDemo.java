import java.util.Scanner;

class Employee{
	int eno,age,salary;
	String name, dept;
	Employee(){}
	Employee(int e,String n,int a,String d, int s){
		this.eno=e;
		this.name=n;
		this.age=a;
		this.dept=d;
		this.salary=s;
	}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}

public class EmpDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee[] emps= new Employee[7];
		
		for (int i=0;i<7;i++) {
			int eno,age,salary;
			String name, dept;
			System.out.println("Enter Employee ID ["+(i+1)+"]: ");
			eno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name ["+(i+1)+"]: ");
			name=sc.nextLine();
			System.out.println("Enter Employee Age ["+(i+1)+"]: ");
			age=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Department ["+(i+1)+"]: ");
			dept=sc.nextLine();
			System.out.println("Enter Employee Salary ["+(i+1)+"]: ");
			salary=sc.nextInt();
			sc.nextLine();
			
			emps[i]=new Employee(eno,name,age,dept,salary);
		}
		
		int maxSal=emps[0].salary;
		Employee rich= emps[0];
		for (Employee emp : emps) {
			if (emp.salary>maxSal) {
				maxSal=emp.salary;
				rich=emp;
			}
		}
		
		System.out.println("=======================================");
		System.out.println("Employee with highest salary is");
		System.out.println("=======================================");
		System.out.println("ID: "+rich.eno);
		System.out.println("Name: "+rich.name);
		System.out.println("Age: "+rich.age);
		System.out.println("Department: "+rich.dept);
		System.out.println("Salary: "+rich.salary);
		
		
		
	}
}
