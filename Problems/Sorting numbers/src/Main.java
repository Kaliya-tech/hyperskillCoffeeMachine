import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int minVal = Integer.MAX_VALUE;
            int minIndex = numbers.length - 1;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < minVal) {
                    minVal = numbers[j];
                    minIndex = j;
                }
            }
            if (numbers[i] > numbers[minIndex]) {  //swap
                int tmp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = tmp;
            }
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}