public class Duplicate {
    public static void main(String[] args) {
        int[] numbers = {15, 12, 18, 48, 15, 32};
        int n = numbers.length;

        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int k = 0; k < j; k++) {
                if (numbers[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[j] = numbers[i];
                j++;
            }
        }

        System.out.print("\nArray after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
