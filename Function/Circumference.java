/*Write a function that takes in the radius as input and returns the circumference of a circle. */

package Function;
import java.util.*;
public class Circumference{

    public static Double GetCircumeference(Double radius){
        return 2 * 3.14 * radius ;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Double r =sc.nextDouble();
        System.out.println(GetCircumeference(r));
        sc.close();
    }
}