import java.util.Scanner;
public class PracticeProgram2
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Type something and hit enter");
        String oldstring = in.nextLine();
        int length = oldstring.length();
        char[] StringArray = new char[length];
        for(int i = 0; i < length; i++)
        {
            char ch = oldstring.charAt(i);
            if(Character.isUpperCase(ch)==true)
            {
                ch = Character.toLowerCase(ch);
            }
            else
            {
                ch = Character.toUpperCase(ch);
            }
            StringArray[i] = ch;
        }
        System.out.println(StringArray);
        in.close();
    }
}