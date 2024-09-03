import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        boolean flag=false;

        for(int i=2;i<n-1;i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
       if(flag==true)
       {
        System.out.println(n+ "is not a prime number");
       } else
       System.out.println(n+ "is prime number");  
    } 
}
        
        
        
        
        
        
        
        
     
    

