package Thread.MultiThreadDemo;
//Launch多重執行緒方法

//有一個印數字的執行緒Class
class PrintNum implements Runnable {
        private int  max;

        public PrintNum(int max) {
                this.max = max;
        }

        @Override
        public void run() {
                for (int i = 0; i < max; i++) {
                        System.out.print(i+" ");
                }
        }
}

//有一個印字元的執行緒Class
class PrintChar implements Runnable {
        private int  times;
        private char aChar;

        public PrintChar(int times, char aChar) {
                this.times = times;
                this.aChar = aChar;
        }

        @Override
        public void run() {
                for (int i = 0; i < times; i++) {
                        System.out.print(aChar);
                }
        }
}

public class PrintSomething {
        public static void main(String[] args) {
//             印數字Thread跑兩次，印字元Thread跑一次
//                放在new Thread() 裡面的要是一個Runnable物件;
                Thread thread01 = new Thread(new PrintNum(50));
                Thread thread02 = new Thread(new PrintNum(50));
                Thread thread03 = new Thread(new PrintChar(50, 'a'));

                thread01.start();
                thread02.start();
                thread03.start();

        }
}
