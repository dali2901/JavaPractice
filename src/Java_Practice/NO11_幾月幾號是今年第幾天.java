package Java_Practice;

import java.util.Scanner;

public class NO11_幾月幾號是今年第幾天 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入年份 : ");
        int year = scanner.nextInt();

        System.out.println("請輸入月份");
        int month = scanner.nextInt();

        System.out.println("請輸入日期");
        int day = scanner.nextInt();

        int[ ] days = { 31, 28 ,31, 30 , 31, 30, 31, 31, 30, 31, 30, 31};
        boolean leapYears = (year % 4 ==0);

        if (leapYears){
            days[1] = 29;
        }

        int result =0;
        for (int i=0 ; i<month; i++){
            result = result + days[i];
        }

        System.out.println( year +"年" +"總共有"+(result+day)+"天" );
    }
}
