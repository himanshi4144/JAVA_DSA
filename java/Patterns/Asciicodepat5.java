package Patterns;

public class Asciicodepat5 {
    public static void main(String[] args) {
        int n=5;
        char a='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(a+j)+" ");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                System.out.print((char)(a+j)+" ");
            }
            System.out.println();
        }
    }
    
}
