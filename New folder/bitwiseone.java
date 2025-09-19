import java.util.Scanner;

public class bitwiseone{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Bitwise AND:" + (a & b));
        System.out.println("Bitwise OR:" +(a|b));
        System.out.println("Bitwise XOR:" +(a^b));
        System.out.println("Bitwise NOT:" +(~a));
        System.out.println("Bitwise left shift:" +(a<<2));
        System.out.println("Bitwise Right shift:" +(a>>2));
    }
}