package Java_Practice;

import java.util.Scanner;
//平分蛋糕
public class cutTheCake {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("請輸入要均分給幾人");
                int n = scanner.nextInt();

                int cut = callDivideTimes(n);
                if (cut == -1) {
                        System.out.println("平分不了");
                }
                System.out.println("要分" + cut + "刀");
        }

        public static int callDivideTimes(int n) {
                int circle = 360;
                if (circle % n == 0) {
                        if (n % 2 == 0) {
                                return n / 2;
                        } else if (n % 3 == 0) {
                                return n;
                        } else if (n % 5 == 0) {
                                return n;
                        }
                } else {
                        return -1;
                }
                return -1;
        }
}
