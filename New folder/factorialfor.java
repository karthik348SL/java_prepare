import java.util.*;

public class reversenum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much number for the reverse number ");
        int a = sc.nextInt();
        System.out.println("Enter the number for reverse number ");
        int b = sc.nextInt();
        
        for(int i = 1; i<=a; i++){
            int r = b %10;
            int q = b/10;
            b = q;
            System.out.println("the reverse number is "+ r);
        }
        
    }
}
