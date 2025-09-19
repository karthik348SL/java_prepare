public class amstrongwhile {

    public static void main(String args[]){
        int num = 123;
        int sum = 0;
        while(num>0){
            int r = num%10;
            int q = num/10;
            num = q;
            sum+=(r*r*r);
            System.out.println("the amstrong number is "+ sum);
        }
        if(123==sum){
            System.out.println("123 is a amstrong number");
        }
        else{
            System.out.println("123 is not a amstrong number");

        }
    }
}