package myDSA;
public class VerticalPyramid {
    public static void main(String arg[]){
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
            System.out.print("*");
            }
           
            
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
            System.out.print("*");
            }
           
            
            System.out.println();
        }
        
    }

}
