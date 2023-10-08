package Java_Practice;

public class NO17_printPyramid {

    public static void printStars( int space , int stars){

        String result = " ";
        for (int i=0; i<space; i++){

            result += " ";
        }

        for (int i=0; i<stars;i++){

            result += "*";
        }
        System.out.println(result);
    }

    public static void pyramid(int n ){
        int stars=1;
        int space=n-1;

        while(space>=0){

            printStars(space,stars);
            space--;
            stars += 2;

        }

    }


    public static void reversePyramid(int n ){
        int stars=2*n-1;
        int space=0;

        while(stars>=1){

            printStars(space,stars);
            space++;
            stars -= 2;

        }

    }


    public static void main(String[] args) {


        pyramid(1);
        System.out.println("========================");
        pyramid(3);
        reversePyramid(3);
        System.out.println("========================");
        pyramid(5);
        reversePyramid(5);


        }
    }

