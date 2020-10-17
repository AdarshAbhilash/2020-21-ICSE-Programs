//This is a menu-driven program designed to check whether a number is a palindrome and/or a perfect number or neither.
//Programmer - Adarsh Abhilash
//Version 1.0
//Date - 19 September 2020
import java.util.*;
public class MenuDriven
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int i, n, s=0, chc;
        System.out.println("Choose the number corresponding to your option");
        System.out.println("1 -- Palindrome Check");
        System.out.println("2 -- Perfect Number Check");
        chc = in.nextInt();
        switch(chc)
        {
            case 1: System.out.println("Enter a number");
            n = in.nextInt();
            for(i=n; i>0;i=i/10)
            {
                int d = i%10;
                s=s*+d;
            }
            if(s==n)
            {
                System.out.println("The number you entered is a palindrome");
            }
            else
            {
                System.out.println("The number you entered is not a palindrome");
            }
            case 2: System.out.println("Enter a number");
            int nx = in.nextInt();
            for(i=1;i<nx;i++)
            {
            if(nx%i==0) 
            s+=i;
            }
            if(s==nx)
            {
                System.out.println("The number you have entered is a perfect number");
            }
            else 
            {
                System.out.println("The number you have entered is not a perfect number");
            }
            default: System.out.println("Whoops, something went wrong. Please restart the program to try again");
        }
        in.close();
    }
}