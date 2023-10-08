package Algorithm;

import java.util.Arrays;
import java.util.Random;

public class Selection_Sort {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));
        Selection_Sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void Selection_Sort(int[] numbers) {

        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {

//        int min = numbers[i];
            int indexOfMin = i;

            for (int j = i + 1; j < length; j++) {
                if (numbers[indexOfMin] > numbers[j]) {
//                min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }

    }

    private static void swap(int[] numbers, int a, int b) {

        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;


    }
}
