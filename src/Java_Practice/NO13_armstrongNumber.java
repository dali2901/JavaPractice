package Java_Practice;

//打印出Armstrong number ， 又稱為水仙花數，其各位數字的立方和等於該數字本身，EX : 153 = 1的3次方+5的3次方+3的3次方


public class NO13_armstrongNumber {

    public static void main(String[] args) {


        for(int i =100; i<1000; i++){

            //首先取得他每一個數字

            int unit = (i%10);
            int tens = (i/10)%10;
            int hundreds = (i/100)%10;

            int sum = (int) (Math.pow(unit, 3) + Math.pow(tens,3) + Math.pow(hundreds,3));
            if( sum == i ){
                System.out.println( i + "是水仙花數");
            }
        }
    }
}
