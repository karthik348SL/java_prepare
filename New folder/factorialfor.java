import java.util.*;

public class factorialfor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial ");
        int a = sc.nextInt();
        int next = 1;
        
        for(int i = 1;i<=a;i++){
            int term = next * i;
            next = term;
            System.out.println("the factorial of the given number is "+term);
            
        }
    }
}