package Patterns;

public class Pattern24 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<9;j++)
            {
                if (i==5||j==4)
                {
                    System.out.print("*  ");

                    
                }
                else
                {
                   
                    System.out.print("   ");
                    
                }
                    
            }
        
            System.out.println("  ");
        }
    }
}

