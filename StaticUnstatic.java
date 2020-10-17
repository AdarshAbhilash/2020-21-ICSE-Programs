public class StaticUnstatic
{
    public void displaySomething()
    {
        System.out.println("This is a Non-Static method - public void displaySomething()");
    }
    public static void displaySomethingElse()
    {
        System.out.println("This is a Static Method - public static void displaySomethingElse()");
    }
    public static void main(String[]args)
    {
        StaticUnstatic testobject = new StaticUnstatic();
        testobject.displaySomething();
        StaticUnstatic.displaySomethingElse();
        System.out.println("Static methods are invoked using class name while Non-static methods are invoked using object name");
    }
}