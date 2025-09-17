package edu;

import java.awt.dnd.peer.DragSourceContextPeer;
import java.util.Scanner;


class Student
{
	int rno;
	String name;
	String course;
	
	Student(int rno,String name, String course){
		this.rno=rno;
		this.name=name;
		this.course=course;
	}
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	           
}

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		st[0]=new Student(100,"Soul","TYIT");
//		st[1]=new Student(101,"Ona","SYIT");
//		st[2]=new Student(102,"Saksam","SYIT");
//		st[3]=new Student(103,"Vnon","SYIT");
//		st[4]=new Student(104,"Arijet","FYIT");
		
		System.out.println("Enter number of students:");
		int n = sc.nextInt();
		Student[] st = new Student[n];
		
		
		String name,course=null;
		int roll=0;
		Student s;
		for (int i=0;i<n;i++) {
			System.out.println("Enter the roll no. of Student ["+(i+1)+"]:");
			roll=sc.nextInt(); // 100
			sc.nextLine(); // Enter
			System.out.println("Enter name of Student:");
			name=sc.nextLine(); // Captures name without Enter
			System.out.println("Enter course of Student:");
			course=sc.nextLine();
			s=new Student(roll,name,course);
			st[i]=s;
			
		}
		System.out.println("==============================");
		System.out.println("Enter the roll no. to Search:");
		int r=sc.nextInt();
		
		for (Student stu : st) {
			if (r==stu.rno) {
				System.out.println("Roll no: "+stu.rno); 
				System.out.println("Name: "+stu.name);
				System.out.println("Course: "+stu.course);
			}
		}
		

	}

}
// Annsh ka roll number is 25