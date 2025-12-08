package myfirstpackage;

class Myemployee{
     private int id;
     private String name;

    public String getName() {
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
public class get_set {
    public static void main(String [] args)
    {
        Myemployee Pranali = new Myemployee();
        //pranali.id = 26 ;
       // pranali.name = "CodeWithPranali";? throws error due to private access modifier
        Pranali.setName("PranalWithHarry");
        System.out.println(Pranali.getName());

    }
}
