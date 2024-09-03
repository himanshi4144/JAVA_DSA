package Patterns;

public class Pattern29 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            if(j==0||j==4||i==4){
            System.out.print("* ");
            }
            else{
                System.out.print("  ");
             }
            }
            for(int j=1;j<n;j++)
            {
                if(i==0||i==4)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<n;j++)
             {
                if(j==4||i==4)
                {
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
             }
             for(int j=0;j<n;j++)
             {
                if(j==3)
                {
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }  
             }
            
            System.out.println();
        }
    }
}
