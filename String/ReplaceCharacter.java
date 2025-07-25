/*Replace Characters in String*/
package String;
import java.util.*;
public class ReplaceCharacter {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String input =sc.next();
        System.out.print("Enter character to replace :");
        char  oldchar =sc.next().charAt(0);
        System.out.print("Enter new Character ; ");
        char newchar = sc.next().charAt(0);
        String replaced = input.replace(oldchar, newchar);
        System.out.println("Updated String : "+ replaced);
        sc.close();
    }
}
