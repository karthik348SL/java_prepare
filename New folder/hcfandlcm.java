import java.util.*;

public class hcfandlcm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int hcf = 1;

        //HCF part
        for(int i = 1;i<=a && i<=b ;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println("the hcf of two number is "+ hcf);
        //LCM part
        int LCM = (a*b)/hcf;
        System.out.println("The LCM of both of number is "+LCM);

        
    }
}
