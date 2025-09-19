import java.util.*;

public class websiteswitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the websites: ");
        String str1 = sc.nextLine();

        switch(str1.substring(0,str1.indexOf(":")))
        {
            case "https":
            System.out.println("hppertext transfer protocol secure");
            break;

            case "http":
            System.out.println("hypertext transfer protocol");
            break;

            case "ftp":
            System.out.println("file transfer protocol");
            break;
        }
        switch(str1.substring(str1.indexOf(""))){
            case ".com":
            System.out.println("commercial website");
            break;

            case ".org":
            System.out.println("organization website");
            break;

            case ".in":
            System.out.println("indian website");
            break;
        }



    }
    
}
