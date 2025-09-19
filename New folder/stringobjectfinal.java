public class stringobjectfinal{
    public static void main(String args[]){
        String s = "    programming in Java     ";
        String sa = "java.language in c.org";
        String str1 = new String(s);
        String str2 = new String(sa);
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.substring(13));
        System.out.println(str1.substring(9,15));
        System.out.println(str1.trim());
        System.out.println(str2.startsWith("jav"));
        System.out.println(str2.endsWith("org"));
        System.out.println(str2.charAt(2));
        System.out.println(str2.charAt(12));
        System.out.println(str2.indexOf("jav"));
        System.out.println(str2.indexOf(".", 5));
        System.out.println(str2.lastIndexOf(".",17));
        


        }
    }
