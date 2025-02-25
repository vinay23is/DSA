
package myDSA;
public class OneZeroPyramid {
        public static void main(String arg[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print((i+j+1)%2);
            }
           
            
            System.out.println();
        }

        
        
    }

}