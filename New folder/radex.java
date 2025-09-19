import java.util.*;

public class radex{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number: ");
        String str1 = sc.nextLine();

        if(str1.matches(("[0-1]+"))){
            System.out.println("The string is binary Number");
         }
         else if(str1.matches(("[0-7+]"))){
            System.out.println("The number is Octal number");
         }
         else if(str1.matches(("[0-9][A-F]"))){
            System.out.println("The String is Hexa decimal");
         }
         else if(str1.matches(("[0-9]+"))){
            System.out.println("The number is Decimal");
         }
   }
}
