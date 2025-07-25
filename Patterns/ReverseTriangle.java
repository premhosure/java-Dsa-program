/*Write a Java program to generate the following * triangles.

Test Data
Input the number: 6
Expected Output :

******                                                   
 *****                                                   
  ****                                                   
   ***                                                   
    **                                                   
     * 
 */
import java.util.*;
public class ReverseTriangle {
    public static void main(String args[]) 
    {
        Scanner SC= new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = SC.nextInt();
        for (int i = n; i > 0; i--) 
        {
            for (int spc = n - i; spc > 0; spc--) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        SC.close();
    }
}
