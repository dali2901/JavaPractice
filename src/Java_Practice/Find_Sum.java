package Java_Practice;
//1-2+3-4.....n 請寫出計算此公式的演算法

import java.util.ArrayList;
import java.util.Scanner;

public class Find_Sum {


        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("請輸入要算到的數字");

                int n = scanner.nextInt();
                int sum = 0;

                for (int i = 1; i <= n; i++) {

                        if (i % 2 == 0) {
                                sum -= i;
                        } else {
                                sum += i;
                        }
                }

        System.out.println(sum);
    }



}
