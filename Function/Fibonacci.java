/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
 */
package Function;
import java.util.*;
public class Fibonacci {

    public static void PrintFibonacci(int n){
        int a=0 ,  b=1 ;

        System.out.print("Fibonacci series: ");
        System.out.print(a + " ");

        if(n >1){
            for(int i = 2; i<= n; i++){
            System.out.print(b+ " ");
            int temp= b; 
            b = a+ b;
            a= temp; 
            }
        }
        System.out.println();
    }
    public static void main(String[] srgs){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n= sc.nextInt();

        PrintFibonacci(n);
        sc.close();
    }
}
