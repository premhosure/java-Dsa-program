/*Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :

Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5                                                                                
The sum of 5 no is : 15                                                          
The Average is : 3.0                           */

import java.util.*;

public class SumAverage {
    public static void main(String[] args){
        int i, n = 0, s = 0;
        double avg;

        Scanner sc = new Scanner(System.in); 
        System.out.println("Input the numbers:");

        for(i = 0; i < 5; i++){
            n = sc.nextInt();
            s += n;
        }

        avg = s / 5.0; 
        System.out.println("The sum of 5 numbers is: " + s + "\nAverage is: " + avg);
        sc.close();
    }
}
