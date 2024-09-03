package Patterns;
public class Pattern17{
            public static void main(String[] args) {
                int n=5;
                for(int i=n;i>0;i--)
                {
                    for(int j=n;j>2*i;j--)
                    {
                        if(j==0||j==9||i==0||i==9)
                        {
                           System.out.print(5+" ");
                           
                        }
                        else if(i==8||i==1||j==8||j==1)
                        {
                           
                            
                            System.out.print(4+" ");
                        }
                        else if(i==7||i==2||j==7||j==2)
                        {
                           
                            
                            System.out.print (3+" ");
                        }else if(i==6||i==3||j==6||j==3)
                        {
                           
                            
                            System.out.print(2+" ");
                        }
                        else if(i==5||i==4||j==5||j==4)
                        {
                           
                            
                            System.out.print(1+" ");
                        }
                        else
                        System.out.print("  ");
                    }
                    
                    System.out.println(" ");
                }
            //    System.out.print("   "+j); 

            }
        }
  
        
        
    

