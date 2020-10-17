//This program is designed to demonstrate the various aspects of methods in Java
//Programmer - Adarsh Abhilash
//Version - 1.4
//Bug fixes and improvements - Fixed a bug resulting in incorrext operation of calculate()
//Date - 22 September 2020
import java.util.*;
public class BookFairV2
{
    String Bname;
    double price;
    double discountedprice;
    double thousand = 1000.00;
    double threethousand = 3000.00;
    double dispr;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the book");
        Bname = in.next();
        System.out.println("Enter the price of the book");
        price = in.nextDouble();
        in.close();
    }
    void calculate()
    {
        if(price<=thousand)
        {
            discountedprice = price - (price*2/100);
        }
        else if (price>thousand && price<=threethousand)
        {
            discountedprice = price - (price*10/100);
        }
        else
        {
            discountedprice = price - (price*15/100);
        }
         dispr = discountedprice;
    }
    void display()
    {
        System.out.println("Name of the book - "+Bname);
        System.out.println("Discounted Price of the Book" + dispr);
    }
    public static void main(String[] args) 
    {
        BookFairV2 accountant = new BookFairV2();
        accountant.input();
        accountant.calculate();
        accountant.display();
    }
}