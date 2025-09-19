import java.util.*;

public class phoneswitch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phone number");
        String phno = sc.nextLine();

        switch(phno.substring(phno.indexOf("+"),phno.indexOf("-")))
        {
            case "+1":
            System.out.println("This is United States number");
           break;

            case "+91":
            System.out.println("This is India number");
            break;

            case "+44":
            System.out.println("This is United kingdom");
            break;

            default:
            System.out.println("Invalid number");
            break;




        }
    }
}