/*write a function to print sum of all odd number from 1 to n */
package Function;
import java.util.*;
public class SumOfOddNumber {
    public static void PrintSum(int n){
        int sum= 0;

        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                sum = sum +i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        PrintSum(n);
        sc.close(); 
    }
}
