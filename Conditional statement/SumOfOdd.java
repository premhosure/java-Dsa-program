/*Write a Java program that displays the sum of n odd natural numbers.

Test Data
Input number of terms is: 5
Expected Output :

The odd numbers are :                                                            
1                                                                                
3                                                                                
5                                                                                
7                                                                                
9                                                                                
The Sum of odd Natural Number upto 5 terms is: 25 */

import java.util.*;
public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input number of terms is: ");
        int terms = scanner.nextInt();

        int sum = 0;
        int number = 1;

        System.out.println("\nThe odd numbers are :");

        for (int i = 1; i <= terms; i++) {
            System.out.println(number);
            sum += number;
            number += 2; 
        }

        System.out.println("The Sum of odd Natural Number upto " + terms + " terms is: " + sum);

        scanner.close();
    }
}