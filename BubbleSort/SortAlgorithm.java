package BubbleSort;

import java.util.Arrays;

public class SortAlgorithm {
    public static void bubbleSort() {
        int[] numbers = new int[]{9, 6, 7, 5, 1, 3, 2};
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void selectionSort() {
        int[] numbers = new int[]{15, 5, 3, 7, 6, 8, 1, 10};
        for (int i = 0; i < numbers.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void insertSort(){
        int[] numbers = new int[]{1,5,9,46,78,21,1,3,6,9};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(numbers[j]< numbers[j-1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
