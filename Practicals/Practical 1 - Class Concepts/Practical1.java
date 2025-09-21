// Practical 1: Demonstrating Constructor, Inheritance and Hierarchy
// This is full ChatGPT Imma try to find the actual thing I did from bonet lab later.

// Base/Parent class
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

// Subclass inheriting the parent
class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);   // Calling Person constructor
        this.course = course;
    }

    void displayStudent() {
        displayInfo(); // This one gets inherited from the Person class
        System.out.println("Course: " + course);
    }
}


class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayTeacher() {
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}


public class Practical1 {
    public static void main(String[] args) {
        Student s = new Student("Ian", 19, "BscIT");
        System.out.println("-----------------");
        s.displayStudent();

        System.out.println();

        Teacher t = new Teacher("Onasex", 18, "GameDev");
        System.out.println("-----------------");
        t.displayTeacher();

        // Parent p = new SubClass(); will work
        // SubClass sc = new Parent(); will not work
        Person p = new  Student("Eshun",20,"AI Engineer or something");
        p.displayInfo();
    }
}
