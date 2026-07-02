import java.util.*;
public class Leetcode1732{
  public static void main(String[] args){
    int [] gain = {-4,-3,-2,-1,4,3,2};
    System.out.println(largestaltitude(gain));
  } 
  public static int largestaltitude(int [] gain){
    int currentaltitude = 0;
        int highestaltitude = 0;
        for(int i =0;i<gain.length;i++){
            currentaltitude =currentaltitude +gain[i];
            if(currentaltitude>highestaltitude)
             highestaltitude = currentaltitude;

        }
        return highestaltitude;
        
}
}