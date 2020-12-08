import java.util.*;
public class PigLatin
{
    static String Convert(String s)
    {
        int l = s.length();
        int i;
        s.toUpperCase();
        char ch;
        String s2,s3;
        for(i = 0; i<l;i++)
        {
            ch = s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            break;
        }
        s2 = s.substring(i, l);
        s3 = s.substring(0,i);
        String result = s2+s3+"AY";
        return result;
    }
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String test = in.nextLine();
        System.out.println(PigLatin.Convert(test));
        in.close();
    }
}
