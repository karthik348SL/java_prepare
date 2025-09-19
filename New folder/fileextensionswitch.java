import java.util.*;

public class fileextensionswitch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the files which you have given");
        String str1 = sc.nextLine();

        switch(str1.substring(str1.lastIndexOf(".")))
        {
            case ".pdf":
            System.out.println("this is a pdf document");
            break;

            case ".jpg":
            System.out.println("this is a image file");
            break;

            case ".docx":
            System.out.println("this is docx file");
            break;

            case ".mp3":
            System.out.println("this is music file");
            break;
            
        }
    }
}