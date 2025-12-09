package PracticeQuestion;

public class Cat {        // Dog inherits eat() from cat.
    void eat()
    {
        System.out.println(" Cat is eating");
    }
}
class Dog1 extends Cat {   //Puppy inherits:

    void bark()
    {
        System.out.println("Dog is barking");
    } //eat() (from Animal)

                                                         // bark() (from Dog)
}
class Puppy extends Dog1{          // Puppy object can access all methods.
    void weep()
    {
        System.out.println("Puppy is weeping");
    }

public static void main (String[] args) {
    Puppy p = new Puppy();
    p.eat();
    p.bark();
    p.weep();
}
}


