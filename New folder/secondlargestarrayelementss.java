public class secondlargestarrayelementss {
    public static void main(String[] args){
        int max1 = 0;
        int max2 = 0;
        int a[] = {3,9,7,8,12,6,5,15,4,10};

        if(a[0]>a[1]){
            max1 = a[0];
            max2 = a[1];
        }
        else{
            max1 = a[1];
            max2 = a[0];
        }
        for(int i = 2;i<a.length;i++){
            if(a[i]>max1){
                max2 = max1;
                max1 = a[i];

            }
            else if(a[i]>max2){
                max2 = a[i];
            }
        }
        System.out.println("the largest number is "+max1);
        System.out.println("the second number is "+max2);
    }
}
