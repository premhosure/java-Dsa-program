/* make a function to multiply 2 numbers and return the product*/


//answers can be written in multiple ways to compress space 
/* 
package Function;
import java.util.*;
public class MultiplyNumber {
    public static int CalculateProduct(int a, int b){
        int mult = a * b;
        return mult ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int mult = CalculateProduct(a , b);
        System.out.println("multiply of 2 numbers is :" + mult);
        sc.close(); 
    }
}
*/


package Function;
import java.util.*;

public class MultiplyNumber{
 public static int CalculateProduct(int a, int b){
 return a* b;
 }
 public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 int a= sc.nextInt();
 int b= sc.nextInt();

 System.out.println("product of two numbers : "+ CalculateProduct(a, b));
 sc.close();
 }
 }