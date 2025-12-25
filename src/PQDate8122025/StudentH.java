package PQDate8122025;

public class StudentH {
    String name;
    int age;
    char grade;
    float percentage;

    StudentH(String name, int age, char grade, float percentage )
    {
         this.name=name;
         this.age=age;
         this.grade=grade;
         this.percentage=percentage;
    }
    void display()
    {
        System.out.println("name:"+this.name);
        System.out.println("age"+this.age);
        System.out.println("grade"+this.grade);
        System.out.println("percentage"+this.percentage);
    }
    public static void main(String[]args)
    {
        StudentH s1 = new StudentH("harsh",21,'A' , 95.6f);
        s1.display();
    }




}
