package Patterns;
public class Pattern21 {
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
                if(j%2==0)
                {
                    System.out.print("* ");
                }
                else{
                    
                    System.out.print(j+1+" ");
                }
                
            }
            for(int j=i;j>0;j--)
            { 
                if(j%2!=0)
                {
                    System.out.print("* ");
                }
                else{
                    
                    System.out.print(j+" ");
                }
               
            }
            
            System.out.println();
            
        }
    }
}

