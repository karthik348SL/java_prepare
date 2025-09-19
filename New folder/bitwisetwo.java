import java.util.*;

public class bitwisetwo{
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        if((a & 1) == 0){
            System.out.println(a + " is even");
        }
        else{
            System.out.println(a+ "is odd");
        }
        System.out.println("Enter the two numbers: ");
        int b = sc.nextInt();
        int c = sc.nextInt();
        b = b^c;
        c = b^c;
        b = b^c;
        System.out.println("First number is: " +b);
        System.out.println("Second number is: " +c);
        System.out.println ("After Swapping is b " +b+ " and c is " +c);

    }
}