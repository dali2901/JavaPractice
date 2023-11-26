package Thread;


//也可以  Launch  一個 Thread  讓 Class 去 implement Runnable Interface 並複寫 Run()方法
//只是寫法略有不同


public class Thread_Basic03 implements Runnable {

    private int threadNumber;

    public Thread_Basic03(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i + "from Thread" + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }



//    因為上方不是繼承Thread 而是 implements Runnable 所以要這樣寫
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            Thread_Basic03 thread_basic03 = new Thread_Basic03(i);
            Thread thread03 = new Thread(thread_basic03);

            thread03.start();

            try {
                thread03.join();   // thread.join方法 會使執行序執行完 再執行下一條執行序
            } catch (InterruptedException e) {
            }

            thread03.isAlive(); //會回傳一個boolean值看thread是否活著
        }

    }


}
