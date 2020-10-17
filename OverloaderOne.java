import java.util.*;
public class OverloaderOne
{
    public static double sum(double x, double y)
    {
        double z = x+y;
        return z;
    }
    public static double sum(int a, int b)
    {
        int c = a+b;
        return c;
    }
    public static void main(String[]args)
    {
        
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        if (m==1)
        {
        double p = in.nextDouble();
        double q = in.nextDouble();
        double r = OverloaderOne.sum(p, q);
        System.out.println(r);
        }
        else
        {
        int d = in.nextInt();
        int e = in.nextInt();
        double f = OverloaderOne.sum(d, e);
        System.out.println(f);
        in.close();
        }
    }

}