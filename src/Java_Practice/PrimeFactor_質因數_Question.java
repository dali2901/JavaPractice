package Java_Practice;

public class PrimeFactor_質因數_Question {


    public static String math(int n) {

        String result = " ";

        for (int i = 2; i <= n; i++) {
            int count = 0;

            while (n % i == 0) {
                n = n / i;

                count++;
            }

            result  = i + "^" + count +"*";
            System.out.print(result);

        }

        return result;
    }


    public static void main(String[] args) {

        math(24);
    }
}





