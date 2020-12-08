import java.util.*;
public class PracticeProgram1
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String x = in.nextLine();
        int l = x.length();
        int i;
        int p1 = 0;
        int p2 = 0;
        for (i=0; i<=l; i++) 
        {
             p1 = x.indexOf("a");
             p2 = x.indexOf("a", p1+1);

        }
        int varlist[] = {p1, p2};
        System.out.println(varlist.length);
        in.close();
    }
}