package Java_Practice;

public class NO18_bubbleSort {


    public static int[] mySort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[i]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }


    public static void main(String[] args) {
        int[] array = {-5, 2, 34, 4, 6, 677, 12, 45, 15, 21, 1234, 612, 778, 303, 132, 245, 677};
        mySort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}
