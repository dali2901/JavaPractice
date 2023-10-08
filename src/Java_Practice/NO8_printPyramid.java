package Java_Practice;


//編寫一個名為pyramid的函數，唯一的參數是一個大於0的正整數，功能是印出以正整數為層數的金字塔
public class NO8_printPyramid {


    public static  void  printPyramid(int n ){

        String s = " ";
        for (int i =1 ; i<=n; i++){

            s =s +"*";
            System.out.println(s);
        }

    }


    public static void main(String[] args) {

        printPyramid(4);

    }
}
