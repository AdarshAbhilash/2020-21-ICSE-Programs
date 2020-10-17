//This is a menu-driven program designed to check whether a number passed by input from the user is a palindrome and/or a perfect number or neither
//Programmer - Adarsh Abhilash
//Version 1.1
//Version Improvements - Fixed a bug where the program executed the default statement along with the other cases.
//Date - 20 September 2020
import java.util.*;
public class MenuDrivenV2
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int i, n, s = 0, chc;
        System.out.println("Enter the number corresponding to the options given below");
        System.out.println("1 -- Palindrome Check");
        System.out.println("2 -- Perfect Number Check");
        chc = in.nextInt();
        if(chc==1)
        {
            System.out.println("Enter a number between -32768 and 32767");
            n = in.nextInt();
            for(i=n;i>0;i=i/10)
            {
                int d = i%10;
                s=s*+d;
            }
            if(s==n)
            {
                System.out.println("The number you have entered is a palindrome");
            }
            else
            {
                System.out.println("The number you have entered is not a palindrome");
            }
        }
        else if(chc==2)
        {
            System.out.println("Enter a number between -32768 and 32767");
            n = in.nextInt();
            for(i=1; i<n;i++)
            {
                if(n%i==0)
                s+=i;
            }
            if(s==n)
            {
                System.out.println("The number you have entered is perfect");
            }
            else
            {
                System.out.println("The number you have entered is not perfect");
            }
        }
        else
        {
            System.out.println("Please restart the program to try again");
            System.exit(0);
        }
        in.close();
        
    }
}