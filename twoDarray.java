import java.util.*; //this is to import everything 
public class twoDarray { //class name
    public static void main(String a[]){ //
     
    int nums[][]=new int[3][4]; //one 2D array
      
    for(int i=0;i<3;i++){ //outer loop
        for(int j=0;j<4;j++){ //inner loop
            nums[i][j] =(int)(Math.random()*100); //needed random numbers in my array
            System.out.print(nums[i][j]+" "); //to print the output
            }
        System.out.println(); // to show proper row and columns in output
        }
    }
}
