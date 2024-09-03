package Array;

import java.util.Scanner;

public class Sumofevenodd {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=100;
    int arr[]=new int[2];
    for(int i=0;i<=n;i++)
    {
        if(i%2==0)
        {
            arr[0]=i+arr[0];
            
        }
        else{
        arr[1]=i+arr[1];
       
        }
    }
    System.out.println("even number sum is "+arr[0]);
    System.out.println("odd number sum is "+arr[1]);
}
}
