package PQDate8122025;

public class Person {
    String name;
    int age;

    void inputPerson(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
     void displayPerson()
     {
         System.out.println("Name:"+name);
         System.out.println("Age:"+age);
         System.out.println("***************");
     }
}
class Employee extends Person {
    String department;
    int id;
    int salary;
    void inputEmployee(String department,int id,int salary)
    {
        this.department=department;
        this.id=id;
        this.salary=salary;
    }
    void displayEmployee()
    {
        System.out.println("Department:"+department);
        System.out.println("Id:"+id);
        System.out.println("Salary:"+salary);
    }
    public static void main(String[]args)
    {
        Employee e = new Employee();

        e.inputPerson("Pranali", 17);
        e.inputEmployee("It",123,20000);


        e.displayPerson();
        e.displayEmployee();

    }
}

