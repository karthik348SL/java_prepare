import java.util.*;

public class rightrotationofarray {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[]= {3,9,7,8,12,6,5,15,4,10};
        System.out.println("enter the step of rotations");
        int k = sc.nextInt();

        k = k%a.length;

        for(int step = 0;step<k;step++){
            int temp = a[a.length-1];
            for(int i = a.length-1;i>0;i--){
                a[i] = a[i-1];
            }
            a[0] = temp;

        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
