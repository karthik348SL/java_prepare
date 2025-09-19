

public class regularexpone{
    public static void main(String args[]){
        String str1 = new String("000010110");
        String str2 = new String("0x1A3F");
        String str3 = new String("12/12/2025");
        System.out.println(str1.matches("[0-1]+"));
        System.out.println(str2.matches("(0[xX])?[0-9A-Fa-f]+"));
        System.out.println(str3.matches("[0-3][0-9]{2}/[1-12]{2}/[0-9]{4}"));



        
        


    }
}