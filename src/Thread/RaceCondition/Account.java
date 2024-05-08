package Thread.RaceCondition;

//這個Class要拿來實作RaceCondition的狀況

public class Account {

        private int balance = 0;

        public int getBalance() {
                return this.balance;
        }

        public void deposit() {
                int newBalance = this.balance + 1;
                try {
                        Thread.sleep(3);   //  這裡刻意睡千分之三秒 來誇大RaceCondition的效果
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                this.balance = newBalance + 1;
        }
}
