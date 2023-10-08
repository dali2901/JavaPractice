package Java_Practice;

//給你一個句子，請判斷他是不是回文，EX: 上海自來水來自海上

import java.util.Scanner;

public class NO12_backWord {



    public static void main(String[] args) {

        System.out.print("請輸入文字:");
        Scanner scanner = new Scanner(System.in);

        String test = scanner.next();

        boolean reverse = true;

        for (int i=0; i<test.length()/2; i++ ){
            if( test.charAt(i) != test.charAt(test.length()-1-i) ){         //用指標的方式 開頭前進i格 ，後方就後退i格
                    reverse = false;
            }
        }

        if (reverse){
            System.out.println(test+"是一則回文");
        }else {
            System.out.println(test + "並不是回文");
        }
    }
}
