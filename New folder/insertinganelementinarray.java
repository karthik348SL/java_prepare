import java.util.*;

public class insertinganelementinarray{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        a[0] = 2;
        a[1] = 3;
        a[2] = 5;
        a[3] = 6;
        a[4] = 8;
        int n = 5;

        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Enter the positions of array");
        int position = sc.nextInt();

        for(int i = n;i>position;i--){
            a[i] = a[i-1];
        }
        a[position] = number;
        n++;

        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}