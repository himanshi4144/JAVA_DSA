package Patterns;

public class pr1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<2*i+1;j++)
            {
                System.out.print("* ");
            }
           
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
    
}
