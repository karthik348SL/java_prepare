import java.util.*;

    public class logicaltw{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("have you pass the driving test");
            boolean testpassed = sc.nextBoolean();

            if(age>=18 && testpassed==true){
                System.out.println((age>=18 && testpassed==true) + "you have passes test");
            }
            else{
                System.out.println((age>=18 && testpassed==true ) + "you have failed in test");
            }

        }
    }
