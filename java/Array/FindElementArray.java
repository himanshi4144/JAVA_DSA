package Array;

import java.util.Scanner;

public class FindElementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] array = {1,3,12,52,32,1,0,-2};
       System.out.println("Enter any element");
       int Element=sc.nextInt();
    //    int Element=32;
       Boolean flag=false;
       for(int item:array)
       {
       if(item==Element)
       {
        flag=true;
        break;
       }
    }
       if(flag==true){
        System.out.println("Present");
       }
       else{
        System.out.println("not present");
       }
      
    }
    
}
