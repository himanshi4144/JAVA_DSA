package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==0||j==0||i==4||j==4)
                {
                    
                 System.out.print("  *");
                }
                else
                {
                 System.out.print("  ");
                 if(i==2&&j==2)
                {
                    System.out.print("*");
                }
                else{
                    System.err.print(" ");
                }
                }
            }
            System.out.println(" ");
        }

    }
    
}

