public class String_Concat_And_Plus {

//    由下方可知
//    Concat的計算效率 比 + 來得快
//    Concat只適用於 字串 跟 字串 拼接， +號 適用於 字串 和任何對象拼接

//    少量 的拼接 可以用 Concat 跟 +號，   如果是大量的拼接 記得用 StringBuilder 或者 StringBuffer


    public static void main(String[] args) {


        String str1 = "Show me";
        String str2 = "Your Boogaloo~";

        System.gc();
        long startTime01 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str1 = str1.concat(str2);
        }
        long endTime01 = System.currentTimeMillis();

        System.out.println(" Use Concat : " + (endTime01 - startTime01));


        str1 = "Show me";


        System.gc();
        long startTime02 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str1 = str1 + str2;
        }
        long endTime02 = System.currentTimeMillis();

        System.out.println(" Use + : " + (endTime02 - startTime02));

    }


}
