import java.util.*;

public class cuboid{
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float length , breadth , height , area ,volume ,lsa;
        System.out.println("Enter the leagth , breadth and height of a Cuboid ");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        height = sc.nextFloat();
        area = ((2*(length*height))+(2*(breadth*height))+(2*(length*breadth)));
        System.out.println("The total area of a Cuboid is " + area);
        volume = length * breadth * height;
        System.out.println("the Volume of a cuboid is " + volume);
        lsa = 2*((length*height))+(2*(breadth*height));
        System.out.println("the Lateral surface of a Cuboid is " + lsa);

    }
}