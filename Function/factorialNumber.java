// find the factorial of a number 


package Function;
import java.util.*;

public class factorialNumber {

    public static void Printfactorial(int n){
        if(n<0){
            System.out.print("Invalid Number");
            return ;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial =factorial * i;
        }
        System.out.print(factorial);
        return ;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();

        Printfactorial(n);
        sc.close();
    }
}
