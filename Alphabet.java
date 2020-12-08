import java.util.*;
public class Alphabet
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character");
        char c = in.next().charAt(0);
        if(Character.isLetter(c))
        {
            System.out.println("The character you have entered is a letter");
            if(Character.isUpperCase(c))
            {
                System.out.println("Uppercase");
            }
            else
            {
                System.out.println("Lowercase");
            }
        }
        else
        {
            System.out.println("The character you have entered is not a letter");
        }
        in.close();
    }
}