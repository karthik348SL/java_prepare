import java.util.*;

public class searchingarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[]={3,9,7,8,12,6,15,5,4,10};
        System.out.println("Enter the number for searching ");
        int b = sc.nextInt();

        int key = b;
        int keys = 0;
        int position = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==key){
                position = i;
                 keys = a[i];
            }
        }
        if(key == keys){
            System.out.println("the number is at "+position+"th position");
        }else{
            System.out.println("it's not found ");
        }
    }
}
