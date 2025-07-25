/*Convert string to lowercase */
package String;
import java.util.*;
public class LowerCase {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        String input=sc.next();
        String lowercase= input.toLowerCase();
        System.out.println("lowercase :" + lowercase);
        sc.close();
   }
}
