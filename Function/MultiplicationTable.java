/*Make a function to print the table of a given number n. */

package Function;
import java.util.*;
public class MultiplicationTable {

    public static void Printtable(int n){
        for(int i= 1 ; i<=10; i++){
            System.out.println(n + " x "+ i + " = "+ (n * i ));
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        Printtable(number);
        sc.close();
    }
}
