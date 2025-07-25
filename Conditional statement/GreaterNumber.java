/*Write a Java program that takes three numbers from the user and prints the greatest number.

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87 */

import java.util.*;
public class GreaterNumber{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 

        System.out.print("input the 1st number:");
        int num1= sc.nextInt();

        System.out.print("input the 2nd number:");
        int num2=sc.nextInt();

        System.out.print("input the 3rd number:");
        int num3=sc.nextInt();

        int greatest;

        if(num1>num2 && num1 >num3){
            greatest=num1;
        }else if(num2>=num1 && num2>=num3){
            greatest= num2;
        }else{
            greatest=num3; 
        }
        System.out.println("The greatest number:"+ greatest);
        sc.close();
    }
}