import java.util.*;

public class merging{
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = (a << 4)|b;
        System.out.println("After merging that's: " +c);
    }
}