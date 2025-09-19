import java.util.*;

public class areaoftriangle{
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a , b , c  ;
        System.out.println("Enter the length of 3 sides of a triangle");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        double s = (a + b + c) / 2;
        double Area = Math.sqrt(s*((s-a)*(s-b)*(s-c))); 
        System.out.println("The area of the triangle is: " + Area);

    }
}