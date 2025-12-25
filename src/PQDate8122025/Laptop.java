package PQDate8122025;

public class Laptop {
    String brand;
    int price;

    Laptop(String brand, int price)
    {
        this.brand=brand;
        this.price=price;
    }
    void display()
    {
        System.out.println("Brand:"+brand);
        System.out.println("Price:"+price);
    }

    public static void main(String[] args)
    {
        Laptop l =  new Laptop("Apple",100000);
         l.display();
    }
}
