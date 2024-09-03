package Patterns;

public class Pattern26 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
               System.out.print("  ");
            }
            for(int j=0;j<i+1;j++)
            {
                System.out.print(j+1+" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(j+" ");
            }
         System.out.println();
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<n-i;j++)
            {
               System.out.print("  ");
            }
            for(int j=0;j<i-1;j++)
            {
                System.out.print(j+1+" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(j+" ");
            }  
            System.out.println();
        }
    }  
}
