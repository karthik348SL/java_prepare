public class selectionsortofarray {

    public static void main(String args[]){
        int a[] = {7,8,3,1,2};

        for(int i = 0;i<a.length;i++){
            int smallest = i;
            for(int j = i+1;j<a.length;j++){
                if(a[smallest]>a[j]){
                    smallest = j;
                }

                }
                int temp = a[i];
                a[i] = a[smallest];
                a[smallest] = temp;
            }
            System.out.println("the sorted array is ");
            for(int i = 0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
