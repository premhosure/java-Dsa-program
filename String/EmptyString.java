/*check if string is empty */
package String;
import java.util.*;
public class EmptyString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String input= sc.next();
        
        if(input.isEmpty()){
            System.out.println("The String is empty.");
        }else{
            System.out.println("the string is not empty.");
        }
        sc.close();
    }
}
