package myDSA;
public class P17_Aplha_Hill
 {
    public static void main(String arg[])
    {
       // Outer loop for the number of rows.
       int N=6;
       
       for(int i=1;i<=N;i++)
       {
        char ch='A';
            for(int j=1;j<=N-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
            {   
                System.out.print(ch+" ");
                ch++;
            }
            ch--;
            ch--;
            for(int j=0 ;j<i-1;j++)
            {
            
                System.out.print(ch+" ");
                ch--;
                
            }
            

            System.out.println();
            
       }
       }
      }
    
    

