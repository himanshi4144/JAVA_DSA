package Array;
import java.util.Scanner;
public class Arrayinput {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size ");
    int size=sc.nextInt();
    int arr[]=new int[size];

    for(int i=0;i<size;i++)
    {
      System.out.print("Enter the value of: "+i+" ");
      arr[i]=sc.nextInt();
      System.out.println();
    } 
    System.out.print("[");
    for(int i=0;i<size;i++)
    {
        System.out.print(arr[i]+",");
    }
    System.out.println("]");
  }
}    
      
    
