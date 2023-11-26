package Thread;



public class Thread_Basic01 extends Thread {



    //    想要把一段程式碼變成多重執行序(MultiThread), 就要把他放在run()方法裡面
    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {


        Thread_Basic01 threadBasic01 = new Thread_Basic01();
        Thread_Basic01 threadBasic02 = new Thread_Basic01();


        //如果真的要執行多重執行序不能用run方法, 而是用start方法
        //如果用run()方法 即   threadBasic01.run(); 他會執行完第一個再執行下一個, 可執行下方住解嘗試
        //        threadBasic01.run();
        //        threadBasic02.run();

        //        threadBasic01.start();
        //        threadBasic02.start();

        //        可以用for迴圈一次執行五個thread
        for(int i=1; i<=5; i++){
            Thread_Basic01 threadBasic03 = new Thread_Basic01();
            threadBasic03.start();
        }


    }


}
