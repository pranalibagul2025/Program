package PracticeQuestion;

public class StudentCV
{
    String name;
    int rollno;
    int age;

    StudentCV()
    {
        name="pranuu";
        rollno=26;
        age=17;
    }
    StudentCV(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
        this.age=age;
    }
    StudentCV(String name,int rollno,int age)
    {
        this.name=name;
        this.rollno=rollno;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("Age:"+age);
        System.out.println("**************");


    }
    public static void main(String[]args)
    {
        StudentCV s1 = new StudentCV();
        StudentCV s2 = new StudentCV("tanu",45);
        StudentCV s3 = new StudentCV("komal",9,21);

        s1.display();
        s2.display();
        s3.display();

    }

}
