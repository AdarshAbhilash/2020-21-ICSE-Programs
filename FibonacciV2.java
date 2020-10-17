//This is a program designed to display the first 10 Fibonacci numbers
//Programmer - Adarsh Abhilash
//Version - 1.1
//Date - 19 September 2020
public class FibonacciV2
{
     public static void main(String[] args) 
    {
        int a = 0, b=1, c, i, count =10;
        for(i = 1; i<=count; ++i)
        {
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}