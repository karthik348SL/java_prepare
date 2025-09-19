import java.util.*;

public class leap{
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int leapyear;
        System.out.println("Enter the Leap Year");
        leapyear = sc.nextInt();
        if(leapyear % 400 == 0){
            System.out.println("it's a leap year");
        }
        else if(leapyear % 100 == 0){
            System.out.println("it's not a leap year");
        }
        else if(leapyear %  4 == 0){
            System.out.println("it's a leap year");
        }
        else{
            System.out.println("it's not a leap year");
        }
    }
}