import java.util.*;
public class IntegerArray
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a[] = new int [10],i;
        boolean f=true;
        System.out.println("Enter 10 Numbers");
      input:  for (i=0;i<10;i++)
        a[i]=in.nextInt();
       calculate:  for (i=0;i<10;i++)
        {
            if(!(a[i]>=100&&a[i]<=999))
            {
                f=false;
            }
        }
        if(f)
        System.out.println("All are three digit numbers"); 
        else 
        System.out.println("All are not three digit numbers");
        in.close();
    }
}