import java.util.*;

public class apfor {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        int commondifference = 5;

        for(int i = 0;i<=21;i+=5){
            int term = a + i;
            System.out.println("the term is "+ term);

        }
        System.out.println("the common difference is "+ commondifference);

    }
}