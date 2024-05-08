package Thread.RaceCondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImplRaceCondition {


        private static final Account account = new Account();

        private static class AddMoneyTask implements Runnable{


                @Override
                public void run() {
                        account.deposit();
                }
        }

        public static void main(String[] args) {
                ExecutorService executorService = Executors.newCachedThreadPool();

                //create 100 tasks
                for(int i = 0; i<100; i++ ){
                        executorService.execute(new AddMoneyTask());
                }

                executorService.shutdown();
                while(!executorService.isTerminated()){

                }
                System.out.println("The Balance is " + account.getBalance());
        }
}
