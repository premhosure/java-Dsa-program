/*3.Convert string to uppercase. */
package String;
import java.util.*;
public class Uppercase {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String input = sc.next();
        String uppercase =input.toUpperCase();

        System.out.println("uppercase :" + uppercase);
        sc.close();
    }
}
