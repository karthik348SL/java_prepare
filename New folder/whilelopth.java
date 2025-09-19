import java.util.*;

public class whilelopth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int fact = 1;

        while (a<=10) {
            fact = fact * a;
            a++;
        }
        System.out.println(fact);

    }
    
}
