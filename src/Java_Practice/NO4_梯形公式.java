package Java_Practice;

//這個CLASS 在寫等差級數 ， 也可以說梯形公式
//並可以用時間複雜度去測量

//編寫一個名為addUpTo()的函數，參數為一個整數n，return type 為int，return 值應為1+2+3+4+.......n-1+n
public class NO4_梯形公式 {


    public static int addUpTo_Way01(int n) {
//    用for loop解
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }


    public static int addUpTo_Way02(int n) {
        //用公式解

        return ((1 + n) * n) / 2;
    }

    public static int addUpTo_Way03(int n) {
        //用遞迴函式解(自己呼叫自己)
        if (n == 0) {
            return 0;
        } else {

            return n + addUpTo_Way03(n - 1);

        }
    }


    public static void main(String[] args) {


        long start = System.currentTimeMillis();

        System.out.println(addUpTo_Way01(10));
        System.out.println(addUpTo_Way01(100));
        System.out.println(addUpTo_Way01(1000));
        System.out.println(addUpTo_Way01(10000));
        System.out.println(addUpTo_Way01(100000));

        long end = System.currentTimeMillis();
        System.out.println("第一個方法，FOR迴圈，總共花了" + (end - start));


        start = System.currentTimeMillis();

        System.out.println(addUpTo_Way02(10));
        System.out.println(addUpTo_Way02(100));
        System.out.println(addUpTo_Way02(1000));
        System.out.println(addUpTo_Way02(10000));
        System.out.println(addUpTo_Way02(100000));

        end = System.currentTimeMillis();
        System.out.println("第二個方法，梯形公式解，總共花了" + (end - start));

        start = System.currentTimeMillis();

        System.out.println(addUpTo_Way03(10));
        System.out.println(addUpTo_Way03(100));
        System.out.println(addUpTo_Way03(1000));
        System.out.println(addUpTo_Way03(10000));
        System.out.println(addUpTo_Way03(100000));

        end = System.currentTimeMillis();
        System.out.println("第三個方法，遞迴解，總共花了" + (end - start));
// 遞迴解 會讓IntelliJ啟動自動結束機制避免無窮迴圈 執行時要調整

    }
}
