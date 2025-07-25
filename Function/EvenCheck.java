/*Make a function to check if a given number n is even or not.
 */

package Function;
import java.util.*;
public class EvenCheck {

    public static boolean IsEven(int n){
        return n % 2 == 0 ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        if(IsEven(number)){
            System.out.println(number + " is a even number");
        }else{
            System.out.println(number + " is not an even number ");
        }
        sc.close();
    }
}
