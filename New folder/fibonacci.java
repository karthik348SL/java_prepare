public class fibonacci {

    public static void main(String args[]){
        int first=0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);

        for(int i=0;i<=50;i++){
            int next = first + second;
            first=second;
            second=next;
            System.out.println(next);
              
        }
    }
}