package PQDate9122025;

public class Animal {
    void sound()
    {
        System.out.println("Animal make a sound");
    }
    class Dog{
        void sound()
        {
            System.out.println("Dog is bark");
        }
    }
    class Cat extends Animal{
        void sound()
        {
            System.out.println("Cat is meows");
        }
    }


}
