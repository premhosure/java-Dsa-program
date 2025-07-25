public class Swap {
    public static void main(String[] args){
        int [] numbers={10,20,30,40,50,60,70,80,90};
        int temp = numbers[0];
        numbers[0]= numbers[numbers.length -1 ];
        numbers[numbers.length -1]=temp;

        for(int num :numbers)
        System.out.println(num +" ");
    }
    
}
