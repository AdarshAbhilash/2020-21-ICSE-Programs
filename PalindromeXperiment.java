import java.util.*;
public class PalindromeXperiment
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        StringBuffer a1 = new StringBuffer(in.nextLine());
        StringBuffer a2 = new StringBuffer(a1.reverse());
        if(a2==a1)
        {
            System.out.println("True");
        }
        else System.out.println("false");
        in.close();
    }
}