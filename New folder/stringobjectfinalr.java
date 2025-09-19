public class stringobjectfinalr{
    public static void main(String args[]){
        String str1 = new String("programmer@gmail.com");
        String username = new String("programmer");
        String domain = new String("@gmail.com");
        String another = new String("@hotmail.com");
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.substring(0,10));
        System.out.println(str1.substring(10,20));
        System.out.println(str1.startsWith(username));
        System.out.println(str1.endsWith(domain));
        System.out.println(str1.indexOf("@"));
        System.out.println(str1.charAt(10));
        System.out.println(str1.lastIndexOf("."));
        System.out.println(str1.charAt(16));
        System.out.println(username.concat(domain));
        System.out.println(domain.equals(another));
        

        

    }
}