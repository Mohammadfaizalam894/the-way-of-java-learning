import java.util.*;
public class Righttringle {
    public static void main(String[] args){
        righttringle(6);

    }
    static void righttringle(int n){
        for (int row =0;row<n;row ++){
            for ( int col = 0; col <= row; col++){
                System.out.print("* ");
            }
        
    
    System.out.println();
        }
    }
}
