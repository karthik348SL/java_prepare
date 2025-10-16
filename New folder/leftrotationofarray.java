import java.util.*;

public class leftrotationofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the step of rotation:");
        int k = sc.nextInt();
        int a[] = {3,9,7,8,12,6,5,15,4,10};

        k = k % a.length;

        for (int step = 0; step < k; step++) {
            int temp = a[0];
            for (int i = 1; i < a.length; i++) {
                a[i - 1] = a[i];
            }
            a[a.length - 1] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
    }
}