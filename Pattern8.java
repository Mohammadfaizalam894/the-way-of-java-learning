import java.util.*;
public  class Pattern8 {
    public static void main(String[] args){
        pattern(5);

    }
    static void pattern(int n){
        for (int i=1; i<=n;i++){
                
                

                for(int s =0; s <=i ;s++){
            System.out.print(" ");
        }
            for(int j=n;j>=i;j--){

        
        System.out.print("* ");
    }

System.out.println();

    }
    
}

}