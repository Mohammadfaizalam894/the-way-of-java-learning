import java.util.*;
public class Leetcode66{
    public static void main(String[] args){
        int [] digits = {1,2,3};
        int[]ans = FindNumber(digits);
        System.out.println(Arrays.toString(ans));


    }
      public static int[] FindNumber(int[] digits){
        int sum = 0;
        for(int i =0;i<digits.length;i++){
            sum =  sum*10 +digits[i];
        }
        sum = sum+1;// add one in the given number
        // count the digits in finded number
        int count =0;
        int temp = sum;
        while(temp>0){
            temp = temp/10;
            count ++;
        }
        int [] result = new int[count];
        //convert the number into array
        for(int i = count-1;i>=0;i--){
            result[i] = sum%10;
            sum = sum/10;
        }
        return result;
      }
      

        
     
}