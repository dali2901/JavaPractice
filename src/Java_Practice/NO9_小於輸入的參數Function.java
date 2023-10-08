package Java_Practice;

//編寫一個名為findsmallaccount的函數， 參數是一個整數Arr和一個整數n，返回值為一個整數
//用來表示Arr中有多少元素小於輸入整數n
public class NO9_小於輸入的參數Function {

    public static int findSmallCount(int[] arr, int n) {

        int counter = 0;
        for (int i : arr) {
            if (i < n) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {

        System.out.println(findSmallCount(new int[ ] {1,2,3} , 2 ));
        System.out.println(findSmallCount(new int[ ] {1,2,3,4,5} , 0 ));
        System.out.println(findSmallCount(new int[ ] {1,2,3,4,5,6,7,8,9,10} , 8 ));
    }
}
