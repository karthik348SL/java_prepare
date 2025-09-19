import java.util.*;

public class gpforloop {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        int common_ratio=3;

        for(int i = 0;i<=10;i++){
            int term = a*common_ratio;
            System.out.println("the term is "+term);
            a = term;
        }
        System.out.println("the common ratio is "+ common_ratio);

    }
}