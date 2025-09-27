public class maximumelemetarray {
    public static void main(String args[]){
        int b[]={3,9,7,8,12,6,15,5,4,10};
        int max = 0;

        for(int i=0;i<b.length;i++){
            if(b[i]>max){
                max = b[i];
            }
        }
        System.out.println("The maximum number is "+max);
    }
}
