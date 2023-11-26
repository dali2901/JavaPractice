package Thread;

//承Thread_Basic01, 我們給Thread一個編號, 再用for迴圈印出來
//去看看不同編號的thread印出來的順序是否一樣

//當其中一個thread爆出 Exception 不會影響其他的thread 執行
//當thread以外發生Exception 也不會影響thread執行
public class Thread_Basic02 extends Thread{

    private int threadNumber;

    public Thread_Basic02(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i+"from Thread" + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }


    public static void main(String[] args) {

        for(int i=1; i<=3; i++){

            Thread_Basic02 thread = new Thread_Basic02(i);
            thread.start();

        }




    }
}
