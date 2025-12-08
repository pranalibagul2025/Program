package PracticeQuestion;

public class Book {
    String title ;
    String author;
    int price;
    Book(String title,String author,int price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display()
    {
        System.out.println("titel:"+title);
        System.out.println("author:"+author);
        System.out.println("price:"+price);
    }
    public static void main(String[]args)
    {
        Book b1 = new Book("Java Programing","Jame Gosing",500);
        b1.display();
    }
}
