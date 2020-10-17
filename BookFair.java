//This is a program that showcases various concepts in Java
//Programmer - Adarsh Abhilash
//Version - 1.0
//Date - 20 September 2020
import java.util.*;
public class BookFair
{
    String Bname; //This stores the name of the book
    double price; //This stores the price of the book
    double discountedpricecalculator = 0;
    void input() //This method is used to input the name and price of the book
    {
        Scanner input1 = new Scanner(System.in);
        Bname = input1.nextLine();
        price = input1.nextDouble();
        input1.close();
    }
    void calcuate() //This method is used to calculate the price of the book after discount
    {
        
        if(price<1000)
        {
            discountedpricecalculator = price-(2/100*price);
        }
        else if(price>1000 && price<=3000)
        {
            discountedpricecalculator = price-(10/100*price);
        }
        else if(price>3000)
        {
            discountedpricecalculator = price-(15/100*price);
        }
    }
    void display()//Displays the price of the book after discount
    {
        double discountedprice = discountedpricecalculator;
        System.out.println("Name of the book - "+Bname);
        System.out.println("Price of the book after discount - "+discountedprice);
    }
    public static void main(String[]args)
    {
        BookFair bkmgr = new BookFair();
        bkmgr.input();
        bkmgr.calcuate();
        bkmgr.display();
    }
}