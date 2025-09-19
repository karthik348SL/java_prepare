import java.util.*;

public class grades{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the 3 subject marks");
       int m1 = sc.nextInt();
       int m2 = sc.nextInt();
       int m3 = sc.nextInt();
       
       int total = (m1+m2+m3);
       int average = (m1+m2+m3)/2;
       System.out.println("total 3 marks subject "+ total);
       System.out.println("average is: "+ average);
       
       if(average >= 70){
           System.out.println("Grade: A");
       }
       else if(average >= 60 && average <= 70){
           System.out.println("Grade: B");
       }
       else if(average >=50 && average <= 60){
           System.out.println("Grade: C");
       }
       else if(average >= 40 && average <= 50){
           System.out.println("Grade: D");
       }
       else{
           System.out.println("Grade: Fail");
       }
       
    }
}