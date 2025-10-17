
public class bubblesortofarray {
    
    public static void main(String args[]){
        int a[] = {3,9,7,8,12,6,5,15,4,10};
        for(int i = 0; i<a.length;i++){   //outer loop
            for(int j = 0; j<a.length-i-1;j++){  //inner loop
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array is");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
