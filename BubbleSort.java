import java.util.*;
public class BubbleSort
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the required number of elements");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements");
        for (int i=0; i<n;i++)
        {
            a[i] = in.nextInt();
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                 temp = a[i];
                 a[i]=a[j];
                 a[j] = temp;  
                }
            }
        }
        System.out.println("Descending Order");
        for(int i = 0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        in.close();
    }
}