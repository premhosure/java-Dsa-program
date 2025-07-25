/*Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
 */

package Function;
import java.util.*;
public class AgeEligible {

    public static boolean IsEligible(int age){
        if(age >= 18){
            return true;  
        }
        return false ; 
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();

        if(IsEligible(age)){
            System.out.println("is eligible ");
        }
        else{
            System.out.println("not eligible ");
        }
        sc.close();
    }
}
