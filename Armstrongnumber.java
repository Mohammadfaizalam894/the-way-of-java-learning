import java.util.*;

public class Armstrongnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int value = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            
            sum = sum +(rem*rem*rem);
        
            n = n/10;
            
        }
        if (sum == value){
            System.out.println("given no. is armstrong");
        }else{
            System.out.println("given no. is not armstrong");
        }
        
    }
    
}

    

