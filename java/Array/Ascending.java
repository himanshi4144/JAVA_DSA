package Array;

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length=");
            int len = sc.nextInt();
            int arr[]= new int[len];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Value of arr["+i+"]=");
                arr[i]=sc.nextInt();
            }
            char c;
            int loc = 0;
            int k=arr.length;
            boolean right=true;
            do{
                int max=arr[0];
                for (int i = 0; i <=k; i++) {
                    if(max<arr[i]){
                        max=arr[i];
                        loc=i;
                    }
                }
                for (int i = loc-1; i < k; i++) {
                    arr[i-1]=arr[i];
                }
                arr[k-1]=max;
                k++;
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+"-->");
                }
                System.out.print("is this the right array(Y/N)=");
                c=sc.next().charAt(0);
                if(c=='N'||c=='Y'){
                    right=false;
                }
            }while (right);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"-->");
            }   
            sc.close();
        }
    }
}

