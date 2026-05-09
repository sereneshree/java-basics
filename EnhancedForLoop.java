public class EnhancedForLoop { 
    public static void main(Str a[]){

        int nums[]=new int[4];
        nums[0]=1;
        nums[1]=3;
        nums[2]=8;
        nums[3]=6;   

        for (int n:nums){ //this loop only works for array
            System.out.println(n);
        }
     }
    
}
