import java.util.*;

public class menuarthematicswitch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("Menu: ");
        System.out.println("Add");
        System.out.println("Subtract ");
        System.out.println("Multiply");
        System.out.println("Divide");
        System.out.println("Modulus");
        System.out.println("================");

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the options");
        String str2 = sc.nextLine();

        switch(str2){
            case "Add":
            System.out.println("Add is: " +(a+b));
            break;

            case "Subtract":
            System.out.println("subtract is: " +(a-b));
            break;

            case "Multiply":
            System.out.println("Multiply is: " +(a*b));
            break;

            case "Divide":
            System.out.println("Divide is: " +(a/b));
            break;

            case "Modulus":
            System.out.println("Modulus is: " +(a%b));
            break;

            default:
            System.out.println("invalid");
            break;

        }
    }
}