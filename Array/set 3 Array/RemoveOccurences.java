//  remove all occurrences of an element

import java.util.Arrays; 

public class RemoveOccurences
{ 
    public static int[] removeElements(int[] a, int k) 
    { 
        int index = 0; 
        
        for (int i=0; i<a.length; i++) 
            if (a[i] != k) 
                a[index++] = a[i];
        return Arrays.copyOf(a, index); 
    } 

    public static void main(String[] args) 
    { 
        int[] a = { 10,11,20,30,40,50,10,70,10, }; 
        int k = 10; 
        a = removeElements(a, k); 
        System.out.println(Arrays.toString(a)); 
    } 
}