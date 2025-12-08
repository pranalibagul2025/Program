package PracticeQuestion;

public class Student {
    String name;
    int rollno;
    int age;

    // Constructor
    Student(String name, int rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println(" Rollno: " + rollno);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student("pranali", 26, 17);
        s1.display();
    }

}
