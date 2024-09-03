package Patterns;
public class Pattern13 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(j%2!=0)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
    
}
