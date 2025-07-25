public class LeftRotate {
    public static void main(String[] args){
        int [] numbers= {10,52,48,19,34};
        int first = numbers[0];
        for(int i=0; i<numbers.length-1 ; i++)numbers[i] = numbers[i +1];
        numbers[numbers.length -1] = first;

        for(int num: numbers)System.out.println(num + "");
    }
    
}
