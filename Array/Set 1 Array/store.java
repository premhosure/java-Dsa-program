//user input and store in array  
import java.util.*;
public class store{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= 5 ; //input assigning 
//creat an array[]
        int[] number= new int[n];
        System.out.println("enter 5 numbers:");
//took input and stored in array
        for(int i=0; i < n; i++){
            number[i]= sc.nextInt();
        }

        System.out.println("you entered:");
        for(int i=0; i<n; i++){
            System.out.println(number[i]);
        }
        sc.close();
    }
}