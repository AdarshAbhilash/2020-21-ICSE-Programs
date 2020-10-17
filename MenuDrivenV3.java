//This is a program designed to check whether a number input by a user is a palindrome, or a perfect number or neither
//Programmer - Adarsh Abhilash
//Version - 1.2
//Bug Fixes and Improvements - Fixed a bug resulting in faulty operation of the Palindrome Check
//Date - 21 Sepemebr 2020
import java.util.*;
public class MenuDrivenV3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i, n, s=0, chc;
        System.out.println("Choose the number corresponding to the option");
        System.out.println("1 -- Palindrome Check \n2 -- Perfect Number Check");
        chc = in.nextInt();
        if(chc==1)
        {
            System.out.println("Enter a number");
            StringBuffer a1 = new StringBuffer(in.nextLine());
            StringBuffer a2 = new StringBuffer(a1.reverse());
            if(a2==a1)
            {
                System.out.println("True");
            }
            else System.out.println("false");
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
        else System.out.println("Please restart the program to try again");
        in.close();
    }
}