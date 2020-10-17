//This is a function overloader program designed to calculate the area of a cuboid, a cube and a sphere respectively
//Programmer - Adarsh Abhilash
//Version 1.0
//Date - 20 September 2020
import java.util.*;
public class Volume
{
    public static double volCalc(float side)
    {
        double cubevol = side*side*side;
        return cubevol;
    }
    public static double volCalc(double length, double width, double height)
    {
        double cuboidvol = length*width*height;
        return cuboidvol;
    }
    public static double volCalc(double radius)
    {
        double spherevol =  4/3*3.14159*radius*radius*radius;
        return spherevol;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number corresponding to your choice");
        System.out.println("1 -- Cube \n 2-- Cuboid \n 3 -- Sphere");
        int chc = in.nextInt();
        if(chc==1)
        {
            System.out.println("Enter the length of one side of the cube");
            float s = in.nextFloat();
            double resultcube = Volume.volCalc(s);
            System.out.println(resultcube);
        }
        else if(chc==2)
        {
            System.out.println("Enter the length, width and height of the cuboid");
            double l = in.nextDouble();
            double w = in.nextDouble();
            double h = in.nextDouble();
            double resultcuboid = Volume.volCalc(l, w, h);
            System.out.println(resultcuboid);
        }
        else if (chc==3)
        {
            System.out.println("Enter the radius of the sphere");
            double r = in.nextDouble();
            double resultsphere = Volume.volCalc(r);
            System.out.println(resultsphere);
        }
        in.close();
    }
}  