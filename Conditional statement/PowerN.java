/*Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the  of another i.e. xn.
 */

import java.util.*;
public class PowerN {
    public static void main(String[] args){
        System.out.print("Enter x:");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();

        System.out.print("enter n:");
        int n= sc.nextInt();

        int result=1 ;
        
        for(int i =1; i<=n; i++){
            result= result * x;
        }
        System.out.println("x to the  n is :"+ result);
        
        sc.close();
    }
}
