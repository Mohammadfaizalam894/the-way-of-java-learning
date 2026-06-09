import java.util.*;
public class Pattern3 {
    public static void main(String[] args){
        righttringle(6);

    }
    static void righttringle(int n ){
        for (int row =0;row<=n;row ++){
            for ( int col = n; col >row; col--){
                System.out.print("* ");
            }
        
    
    System.out.println();
        }
    }
}

    


