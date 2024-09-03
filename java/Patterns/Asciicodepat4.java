package Patterns;

public class Asciicodepat4 {
    public static void main(String[] args) {
        int n=5;
        char a='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0 ;j<i+1;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<n-i;j++)
            {
                System.out.print((char)(j+a+i)+" ");
            }
            for (int j = n-2; j > i-1; j--) {
                System.out.print((char)(a+j)+" ");
            }
            
            System.out.println();
        }
    }
    
}
