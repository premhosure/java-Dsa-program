/*Write a Java program to display the multiplication table of a given integer.

Test Data
Input the number (Table to be calculated) : Input number of terms : 5
Expected Output :

5 X 0 = 0                                                                        
5 X 1 = 5                                                                        
5 X 2 = 10                                                                       
5 X 3 = 15                                                                       
5 X 4 = 20                                                                       
5 X 5 = 25
 */

import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Input the number(Table to calculate):");
        int number= sc.nextInt();

        System.out.print("input number of terms:");
        int terms=sc.nextInt();

        for(int i=1; i<=terms; i++){
            System.out.println(number+"x"+i+"="+(number*i));
        }
        sc.close();
    }
}
