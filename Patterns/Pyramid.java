/*Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

       1
      2 2
     3 3 3
    4 4 4 4 
 */

import java.util.*;
public class Pyramid {
    public static void main(String[] args){
        int i,j,n,s,x;
   System.out.print ("Input number of rows : ");
   Scanner in = new Scanner(System.in);
		    n = in.nextInt();

   s=n+4-1;
    for(i=1;i<=n;i++)
   {
   for(x=s;x!=0;x--)
    {
   System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
     System.out.print(i+" ");
     }
	System.out.println();
    s--;
   }
}
}