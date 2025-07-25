/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number */

import java.util.*;
public class NumberCheck2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("input number:");
        int num=sc.nextInt();

        System.out.println("input value :"+ num);

        if(num==0){
            System.out.println("Zero");
        }else{
            if(num>0){
                System.out.println("Positive number");
            }else{
                System.out.println("Negative number");
            }

            double absvalue= Math.abs(num);
            if(absvalue<1){
                System.out.print("small");
            }else if(absvalue>100000){
                System.out.print("large");
            }
            System.out.println();
        }
        sc.close();
    }
}
