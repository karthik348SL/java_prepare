import java.util.*;

public class logicalon{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();

        if((a >= 0) && (b >= 0) && (c >=0)){
            System.out.println("(a >= 0 && b >= 0 && c >=0)" + (a >= 0 && b >= 0 && c >=0));
        }
        if((a % 2 == 0) || (b % 2 == 0 ) || (c % 2 == 0 )){
            System.out.println("(a % 2 == 0 || b % 2 == 0 || c % 2 == 0)" + (a % 2 == 0 || b % 2 == 0 || c % 2 == 0));
        }
        if((a!=b)){
            System.out.println("a!=b " + (a!=b) );
        }
    }
}