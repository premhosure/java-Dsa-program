//Reverse the array


public class Reverse {
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        System.out.print("original array: ");
        for(int num: numbers){
            System.out.print(num+ " ");
        }
        int start =0;
        int end= numbers.length-1;
        while(start<end){
            int temp= numbers[start];
            numbers[start]=numbers[end];
            numbers[end]= temp ;

            start++;
            end--;
        }
        System.out.println("reversed array: ");
        for(int num: numbers){
            System.out.println(num+ " ");
        }
    }
}
