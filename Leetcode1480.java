import java.util.*;
public class Leetcode1480 {
    public static void main(String[] args){
        int [] nums = {1,2,3,4,5};
        
        runningsum(nums);
        System.out.println(Arrays.toString(nums));

        
    }
    static void runningsum( int [] nums){
         
        for ( int i=1;i<nums.length;i++){
            nums[i]= nums[i] + nums[i-1];
        }
    }

    
}
