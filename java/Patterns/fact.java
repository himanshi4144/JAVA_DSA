package Patterns;

public class fact {
    public static void main(String[] args) {
        
    
    int n=153;
    int b=n;
    int a=0;
    while(n!=0)
    {
        
        a=b%10;
        n=n/10+a;
    }
    if(b==n)
    {
        System.out.println(" armstrong");
    }
    else{
        System.out.println(" not armstrong");
    }
   }
    
}
