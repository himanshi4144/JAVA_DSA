package Patterns;

public class pr2 {
    public static void main(String[] args) {
        int n=5;
        char a='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print((char)(a+j+i));
            }
            System.out.println();
        }
    }
    
}
