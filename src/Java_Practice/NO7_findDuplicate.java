package Java_Practice;

//編寫一個名為findDuplicate的函數，將一個整數Array作為參數，並檢查Array中是否有重複的值
//如果有return true ，否則return false
public class NO7_findDuplicate {

    public static boolean findDuplicate(int[] array) {

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("重複的數字是" + array[i]);
                    found = true;
                }
            }

        }
        return found;
    }


    public static void main(String[] args) {

        System.out.println(findDuplicate(new int[]{1, 2, 3, 33, 5, 2, 1}));
        System.out.println(findDuplicate(new int[]{}));
        System.out.println(findDuplicate(new int[]{1, 2, 3, 5, 7}));
        System.out.println(findDuplicate(new int[]{1, 2, 3, 3, 2, 1,10, 19, 223 ,223}));


    }
}
