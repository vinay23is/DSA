package myDSA;
public class P16_Aplha_Ramp
 {
    public static void main(String arg[])
    {
       // Outer loop for the number of rows.
       int N=6;
       char ch='A';
       ch--;
      for(int i=0;i<N;i++)
      {
        ch++;
          
        for(int j=0;j<=i;j++)
          {
              System.out.print(ch + " ");
              
          }
          // As soon as the letters for each iteration are printed, we move to the
          // next row and give a line break otherwise all letters
          // would get printed in 1 line.
          System.out.println();
      } 
      }
    }
    

