package algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int temp = 0;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for (int i = 0; i < array.length; i++){
            int j = i - 1;
            while (j >= 0 && array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}