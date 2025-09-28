public class negativelargestelementinarray {
    public static void main(String[] args){
        int a[] = {-5,-1,-9,-2,-6};
        int max1 = -5;
        int max2 = -1;

        if(a[0]<a[1]){
            max1 = a[1];
            max2 = a[0];
        }
        else{
            max1 = a[0];
            max2 = a[1];
        }

        for(int i = 2; i<a.length;i++){
            if(a[i]>max1){
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i]>max2){
                max2 = a[i];
            }
        }
        System.out.println("the largest negative number is "+max1);
        System.out.println("the second largest negative number is "+max2);
    }
}
