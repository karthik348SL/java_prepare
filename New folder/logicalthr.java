import java.util.*;

public class logicalthr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the Number ");
        int num = sc.nextInt();
        
        if(num>=10 && num<=50){
            System.out.println((num>=10 && num<=50));
        }
        else{
            System.out.println(num>=10 && num<=50);
        }
    }
}