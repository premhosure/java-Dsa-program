/*Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

Test Data
Input number: 3
Expected Output :
Wednesday */ 

import java.util.*;
public class WeekdayName {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("input number:");
        int day= sc.nextInt();

        if(day==1){
            System.out.println("Monday");
        }
        else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("saturday");
        }else if(day==7){
            System.out.println("sunday");
        }
        else{
            System.out.println("Invalid number !");
        }
        sc.close();
    }    
}
