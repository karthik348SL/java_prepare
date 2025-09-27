public class sumofarray{
    public static void main(String args[]){
        int a[] = {3,9,7,8,12,6,15,5,4,10};
        int start = 0;

        for(int i=0;i<a.length;i++){
            start = start + a[i];
        }
        System.out.println("the sum of all the element is "+ start);

    }
}