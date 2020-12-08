import java.util.*;
public class SpecialNumber
{
    public static void main(String[] args)
    {
       
        Scanner in =new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a = in.nextInt();
        int i, d, s=0;
        for(i = a; i>0; i/=10)
        {
            d = i%10;
            s = d+s;
        }
        if(a%s==0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not a niven number");
        }
        in.close();
    }
}