/* Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive*/
import java.util.*;
public class NumberCheck {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("input number: ");
        int number= sc.nextInt();

        if(number > 0){
            System.out.println("number is positive");
        }else if(number<0){
            System.out.println("number is negative");
        }else{
            System.out.println("number is zero");
        }
        sc.close();
    }
}
