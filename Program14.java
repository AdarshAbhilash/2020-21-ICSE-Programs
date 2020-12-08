
import java.util.*;
public class Program14
{
    void check (String s)
    {
        s = s.toUpperCase();
        int len= s.length(), i, j;
        Boolean flag = false;
        char ch1, ch2;
        for (i=0; i<len; i++)
        {
            ch1 = s.charAt(i);
            for (j=i+1; j<len; j++)
            {
                ch2 = s.charAt(j);
                if (ch1==ch2)
                {
                    flag = true;
                    break;
                }
            }
        }
        if(flag == false)
        {
            System.out.println("Unique Word");
        }
        else
        {
            System.out.println("Not a unique word");
        }
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Program14 exec = new Program14();
        String a = in.nextLine();
        exec.check(a);
        in.close();
    }
}