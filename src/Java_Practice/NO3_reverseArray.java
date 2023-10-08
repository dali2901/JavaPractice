package Java_Practice;

//  編寫一個reverseArray的函數，參數為一個 Array of Integer ， return type為 int[ ]


public class NO3_reverseArray {

    public static int[] reverseArray(int[] arr) {
        int[] newArray = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            newArray[j] = arr[i];
            j++;
        }
        return newArray;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 123, 555555, 987, 122, 77};
        int[] reverseArray = reverseArray(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        for (int i : reverseArray) {
            System.out.print(i + " ");
        }
    }
}
