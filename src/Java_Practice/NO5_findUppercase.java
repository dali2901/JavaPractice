package Java_Practice;

//編寫一個名為position()的函數，input為String，函數沒有任何return type
//但需要打印出第一個找到的大寫字母，跟他的index位置，
// 如果未找到大寫字母就印出-1

public class NO5_findUppercase {

    public static void charPosition(String s) {

        boolean foundUpperCase = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.toUpperCase(c) == c) {
                System.out.println("在第" + i + "個位置找到大寫" + c);
                foundUpperCase = true;
                return;
            }
        }

        if( !foundUpperCase){
            System.out.println("找不到大寫字所以回傳-1");
        }

    }


    public static void main(String[] args) {


        charPosition("abcd"); // print 找不到大寫字所以回傳-1
        charPosition("AbcD");// print 在第0個位置找到大寫 A
        charPosition("abCD");// print在第2個位置找到大寫 C
        charPosition("aBcd");//  print在第1個位置找到大寫 B
    }
}
