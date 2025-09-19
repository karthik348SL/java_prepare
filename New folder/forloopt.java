import java.util.*;

public class forloopt{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        int sum=0;

        while(a<=10) {
            sum=sum+a;
            a++;
            
        }
        System.out.println(sum);
        
    }
}