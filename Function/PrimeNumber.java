//*Make a function to check if a number is prime or not. */

package Function;
import java.util.*;
public class PrimeNumber {

    public static boolean IsPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<=num / 2; i++){
            if(num% i == 0){
                return false; 
            }
        }
        return true ; 
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number to check if it is a prime  number : ");
        int number = sc.nextInt();
        if(IsPrime(number)){
            System.out.println("is a prime " + number );
        }else{
            System.out.println("is not a prime ." +number);
        }
        sc.close();
    }
}
