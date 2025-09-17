// Practical 1: Demonstrating Constructor, Inheritance and Hierarchy
// This is full ChatGPT Imma try to find the actual thing I did from bonet lab later.

// Base class
class Person {
    String name;
    int age;

    // Constructor of Person
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class 1
class Student extends Person {
    String course;

    // Constructor of Student
    Student(String name, int age, String course) {
        super(name, age);   // Calling parent constructor
        this.course = course;
        System.out.println("Student constructor called");
    }

    void displayStudent() {
        displayInfo();
        System.out.println("Course: " + course);
    }
}

// Derived class 2
class Teacher extends Person {
    String subject;

    // Constructor of Teacher
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("Teacher constructor called");
    }

    void displayTeacher() {
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class Practical1 {
    public static void main(String[] args) {
        Student s = new Student("John", 20, "Computer Science");
        System.out.println("-----------------");
        s.displayStudent();

        System.out.println();

        Teacher t = new Teacher("Alice", 35, "Mathematics");
        System.out.println("-----------------");
        t.displayTeacher();
    }
}
