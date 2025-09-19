import java.util.*;

public class forloopo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();

        while(a!=0){
            int digit = a % 10;
            System.out.print(digit);
            a = a / 10;

        }
    }
}