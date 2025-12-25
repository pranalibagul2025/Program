package PQDate8122025;
  //parent class
public class Animal {
    String type = "Animal";

    void sound()
    {
        System.out.println("Animal makes a sound");
    }

    Animal()
    {
        System.out.println("Amimal called constructor");
    }
}
// child class
class Dog extends Animal
{
    String Type = " Dog";

    Dog(){
        super();
        System.out.println("Dog constructor calling");
    }
    void display()
    {
        System.out.println("child type:"+type);
        System.out.println("parent type:"+super.type);
        super.sound();
    }
    public static void main(String[]args)
    {
        Dog d = new Dog();
        d.display();
    }

}




