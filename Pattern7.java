import java.util.*;
public class Pattern7 {
    public static void main(String [] args){
        pattern5(5);
    }
    static void pattern5(int n){
        for(int i =1;i<2 *n;i++){
            int totalcolinrow = i>n?2*n-i:i;
            int noofspace = n-totalcolinrow;
                for (int s =0;s<noofspace;s++){
                System.out.print(" ");
            }
            for( int j =0;j<totalcolinrow;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}

