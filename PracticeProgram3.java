import java.util.*;
public class PracticeProgram3
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(str.replace('e', '*'));
        in.close();
    }
}

class PracticeProgram4
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name, followed by a space");
        String FirstName = in.nextLine();
        String firstname2 = FirstName.substring(0, 1);
        System.out.println("Enter middle name, followed by a space");
        String MiddleName = in.nextLine();
        String middlename2 = MiddleName.substring(0, 1);
        System.out.println("Enter last name, followed by a space");
        String LastName = in.nextLine();
        String lastname2 = LastName.substring(0, 1);
        String originalname = FirstName+MiddleName+LastName;
        System.out.println(originalname);
        System.out.println(firstname2.replace(firstname2.charAt(1), '*')+" "+middlename2.replace(middlename2.charAt(1), '*')+" "+lastname2.replace(lastname2.charAt(1), '*'));
        in.close();
    }
}