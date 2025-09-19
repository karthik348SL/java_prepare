
public class whilerev {
    public static void main(String args[]){
        int num=2345;
        int count = 1;

        while (num>0) {
            int q = num/10;
            int r = num%10;
            System.out.println("the reverse is:"+r);
            num=q;
            System.out.println(count++);
            
        }
        
    }
    
}
