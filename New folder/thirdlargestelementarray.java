public class thirdlargestelementarray {
    public static void main(String[] args){
        int a[] = {3,9,7,8,12,6,5,15,4,10};
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        if(a[0]>a[1]&&a[0]>a[2]){
            max1 = a[0];
            if(a[1]>a[2]){
                max2 = a[1];
                max3 = a[2];
            }
            else{
                max2 = a[2];
                max3 = a[1];
            }
        }
        else if(a[1]>a[0]&&a[1]>a[2]){
            max1 = a[1];
            if(a[0]>a[2]){
                max2 = a[0];
                max3 = a[2];
            }
            else{
                max2 = a[2];
                max3 = a[0];
            }
        }
        else if(a[2]>a[0]&&a[2]>a[1]){
            max1 = a[2];
            if(a[0]>a[1]){
                max2 = a[0];
                max3 = a[1];
            }
            else{
                max2 = a[1];
                max3 = a[0];
            }
        }

        for(int i = 3;i<a.length;i++){
            if(a[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i]>max2){
                max3 = max2;
                max2 = a[i];
            }
            else if(a[i]>max3){
                max3 = a[i];
            }
        }
        System.out.println("the first largest number is "+max1);
        System.out.println("the second largest number is "+max2);
        System.out.println("the third largest number is "+max3);


    }
}
