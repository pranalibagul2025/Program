package PQDate8122025;

public class Engine {
    String type;
    Engine(String type )
    {
        this.type=type;
    }
    void showEngine()
    {
        System.out.println("Engine type"+type);
    }
}
class Car{
    String name;
    int price;
    Engine engine;
    Car(String name, int price , Engine engine)
    {
        this.name=name;
        this.price=price;
        this.engine=engine;
    }
    void showCar()
    {
        System.out.println("Car Name:"+name);
        System.out.println("Car Price:"+price);
        engine.showEngine();
    }
    public static void main(String[] args)
    {
        Engine e = new Engine("V8 Petrol");
        Car c = new Car("BMW", 5000000, e);
        c.showCar();


    }
}
