public class palindromefor {
    
    public static void main(String args[]){
        int num = 171;
        for(int i=1;i<=3;i++){
            int q = num/10;
            int r = num%10;
            num=q;
            System.out.print(r);

        }
    }
}
