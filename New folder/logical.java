import java.util.*;

public class logical{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        System.out.println("Enter whether person is citizen of country ");
        boolean citizen = sc.nextBoolean();

        if(age >= 18 && citizen == true){
             System.out.println("person is eligible" );
        }
        else{
            System.out.println("person is not eligible");
        }

    }
}