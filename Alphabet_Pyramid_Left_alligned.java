package myDSA;
public class Alphabet_Pyramid_Left_alligned
{
    public static void main(String arg[])
    {
       // Outer loop for the number of rows.
       int N=5;
      for(int i=N;i>0;i--){
          
          // Inner loop will loop for i times and
          // print alphabets from A to A + i.
          for(char ch = 'A'; ch<'A'+i;ch++)
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

