public class SeprateEvenOdd {
    public static void main(String [] args){
        int[] numbers={10,21,30,47,50,63,77,64};

        System.out.print("even: ");
        for(int num : numbers) if(num %2 == 0)
        System.out.print(num+ " ");

        System.out.print("odd : ");
        for(int num: numbers) if(num %2 != 0)
        System.out.print(num +" ");

    }
    
}
