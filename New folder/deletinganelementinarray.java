import java.util.*;

public class deletinganelementinarray {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        a[0] = 3;
        a[1] = 2;
        a[2] = 4;
        a[3] = 6;
        a[4] = 15;
        a[5] = 12;
        int n = 6;

        System.out.println("Enter the positions");
        int position = sc.nextInt();

        for(int i = position;i<n-1;i++){
            a[i] = a[i+1];
            
        }
        n--;

        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
