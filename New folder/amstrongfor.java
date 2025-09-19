public class amstrongfor{
    public static void main(String args[]){
        int num = 153;
        int sum = 0;
        for(int i = 1;i<=3;i++){
            int r = num%10;
            int q = num/10;
            num = q;
            sum+=(r*r*r);
            System.out.println("the amstrong number is "+sum);
        }
    
    }

}