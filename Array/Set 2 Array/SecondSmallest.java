public class SecondSmallest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < first) {
                second = first; 
                first = num;    
            } else if (num < second && num != first) {
                second = num;  
            }
        }

        System.out.println("Smallest number: " + first);
        System.out.println("Second smallest number: " + second);
    }
}
