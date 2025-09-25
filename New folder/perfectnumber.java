import java.util.*;

public class perfectnumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which need to calculate for perfect ");
        int a = sc.nextInt();
        int divisor = a;
        int term = 0;
        
        for(int i = 1;i<divisor;i++){
            if(divisor%i == 0){
                term = term + i;
            }
        }
        System.out.println("the perfect number of "+divisor+" is " +term);

        if(divisor == term){
            System.out.println(term +" this is a perfect number");
        }
        else{
            System.out.println(term+" this is not a perfect number");
        }
    }
}