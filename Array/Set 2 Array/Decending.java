import java.util.Arrays;
public class Decending {
    public static void main(String[] args){
        int[] arr ={32 ,54,98,34,78,49};
       
        Arrays.sort(arr);

        for(int i = 0; i<arr.length/ 2; i++){
            int temp =arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length -1 -i]= temp;
        }
        System.out.println("decending order :" +Arrays.toString(arr));

    }   
}
