package Java_Practice;



//撰寫一個名為PrintEvery3()的方法 ，他會打印出等差數列3 ，1.4.7.10.......88
public class NO1 {


    public  static void  PrintEvery3(){

        for ( int i =1 ; i<=88 ;  i = i+3){
            System.out.println(i);
        }


        int i=1;

        while(i<=88){
            System.out.println(i);
            i+=3;
        }


    }


    public static void main(String[] args) {
        PrintEvery3();
    }
}
