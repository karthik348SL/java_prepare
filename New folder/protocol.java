import java.util.*;

public class protocol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Websites ");
        String str1 = sc.nextLine();

        if(str1.startsWith("https")){
            System.out.println("Hypertext transfer protocol Secure");
        }
        else if(str1.startsWith("ftp")){
            System.out.println("File transfer Protocol");
        }
        else if(str1.startsWith("udp")){
            System.out.println("user Datagram protocol");
        }

        if(str1.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if(str1.endsWith(".gov")){
            System.out.println("government website");
        }
         else if(str1.endsWith(".org")){
            System.out.println("organisational website");
        }
        
    }
}
