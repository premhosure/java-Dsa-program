/*for a given matrix of n * m print its transpose*/
import java.util.*;
public class TransposeArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int matrix[][]= new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                matrix[i][m]=sc.nextInt();
            }
        }
        System.out.println("The Transpose is :");
        for(int j=0;j<m;j++){
            for(int i=0; i<n; i++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
