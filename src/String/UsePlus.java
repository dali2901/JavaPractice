package String;

//印出1+2+3+4+5+6.......+100的字串

public class UsePlus {

//        字串一旦建立就無法變更字串內容
//        使用+號串接字串時，會產生新的String實例，所以如果是重複性地串接場合，EX迴圈或遞迴，因為會頻繁產生新物件，可能造成效能上的負擔


        public static void main(String[] args) {

//                ------------------方法1------------------

                for (int i = 1; i < 100; i++) {
                        System.out.printf("%d+", i);
                }
                System.out.println(100);

//                ------------------方法2------------------

                String text = "";
                for (int i = 1; i < 100; i++) {
                        text = text + i + '+';
                }
                System.out.println(text + 100);
//                 ------------------方法3------------------     stringBuilder使用append方法後 會回傳原有的stringBuilder物件 這段程式碼只產生一個stringBuilder實例，只進行一次輸出

                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 1; i < 100; i++) {
                        stringBuilder.append(i).append('+');
                }
                System.out.println(stringBuilder.append(100).toString());
        }


//
//        StringBuffer
//        Synchronized，即執行緒安全）。如果要頻繁對字串內容進行修改，出於效率考慮最好使用StringBuffer，
//        如果想轉成String型別，可以呼叫StringBuffer的toString()方法。
//
//        StringBuilder
//        （非執行緒安全）。在內部，StringBuilder物件被當作是一個包含字元序列的變長陣列。
//        但不保證同步。該類被設計用作 StringBuffer 的一個簡易替換

//        基本原則：如果要操作少量的資料，用String ；單執行緒操作大量資料，用StringBuilder ；多執行緒操作大量資料，用StringBuffer。

}

