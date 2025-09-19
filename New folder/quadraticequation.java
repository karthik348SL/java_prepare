import java.util.*;

public class quadraticequation{
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a , b , c;
        double r1 , r2 ;
        System.out.println("Enter the A B and C of a Polynomial is");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        r1 = (- b + (Math.sqrt((b*b)-4*a*c))) / (2*a);
        r2 = (- b - (Math.sqrt((b*b)-4*a*c))) / (2*a);
        System.out.println("the quadratic equation is r1 " + r1 + " r2 " + r2);
        
    }
}