/* Get Character at Given Index */
package String;
import java.util.*;
public class IndexString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String input= sc.next();
        int index=sc.nextInt();

        if(index >= 0 && index < input.length()){
            char ch = input.charAt(index);
            System.out.println("Character at index " + index + "is :" +ch);
        }else{
            System.out.println("Invalid index .");
        }
        sc.close();
    }

}
