package Patterns;
public class Pattern4 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if((j+1)%2==0)
                System.out.print(j+1+" ");
                else
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}