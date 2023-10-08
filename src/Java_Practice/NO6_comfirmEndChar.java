package Java_Practice;


//編寫一個comfirmEnding的函數，他將兩個String作為input，並返回一個布林值
//該布林指示第一個input是否以第二個input作為結束
public class NO6_comfirmEndChar {

    public static boolean confirmEndChar(String s1, String s2) {

        int j = s1.length() - 1;
        for (int i = s2.length() - 1; i >= 0; i--) {

            if (s2.charAt(i) != s1.charAt(j)) {
                return false;
            }
            System.out.print(s2.charAt(i));
            j--; //如果比較之後還是一樣就繼續比
        }
        
        return true;
    }


    public static void main(String[] args) {

        System.out.println(confirmEndChar("Boston" , "n"));
        System.out.println(confirmEndChar("Corner", "n"));
        System.out.println(confirmEndChar("contact" , "ntact"));

    }
}
