package Java_Practice;

//求s=a+aa+aaa+aaaa+aa...a的值，其中a是一個數字，相加的項數為n。例如2+22+222+2222+22222(此時共有5個數相加)
//幾個數相加有鍵盤控制。若a  =2, n = 3，則輸出結果的形式如：2+22+222 = 246。


import java.util.Scanner;

public class NO14_mathQuestion {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入a的值");
        int a = scanner.nextInt();

        System.out.println("請輸入n的值");
        int n = scanner.nextInt();

        int result = 0;
        int  count =0;
        for(int i =0 ; i<n; i++){

            count += (int) (a * Math.pow( 10 , i));

            for (int j=0; j<=i; j++){



                result +=  (int) (a * Math.pow( 10 , j));
            }
            System.out.print(  count +"+" +" ");
        }


        System.out.println("計算結果為"+result);

    }





}
