package String;
import java.util.*;
public class Concatenation {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String firstName= "Tonny";
        String lastName= "Stark";
        String FullName= firstName +" "+lastName;
        System.out.println(FullName.length());

        for(int i=0; i<FullName.length(); i++){
            System.out.print(FullName.charAt(i));
        }
        sc.close();
    }
}
