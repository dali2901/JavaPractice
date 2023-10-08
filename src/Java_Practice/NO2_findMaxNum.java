package Java_Practice;


//編寫一個名為findMax()的函數，參數為一個整數陣列，return type為 int ，返回的值為array當中所有元素中最大的那個

public class NO2_findMaxNum {

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]) {

                max = arr[i];
            }

        }
        return max;
    }


    public static void main(String[] args) {

        int[ ]  array = {1 , 2 , 456 ,11111 , 5848 , 55 , 123 };

        System.out.println(findMax(array));
    }


}
