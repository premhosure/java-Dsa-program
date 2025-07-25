/*Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different

 */

import java.util.*;
public class CompareFloat {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("input first floating-point number:");
        double num1 = sc.nextDouble();

        System.out.print("input second floating-point number:");
        double num2 = sc.nextDouble();

        int vlaue1= (int)(num1 *1000);
        int value2= (int)(num2 *1000);

        if(vlaue1 == value2){
            System.out.println("they are the same up to three decimal places");
        }else {
            System.out.println("They are not same");
        }
        sc.close();
    }
}
