import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String stringArray[ ] = scanner.nextLine().split(" ");
        int data[ ] = new int[ stringArray.length];


        for ( int i=0; i<stringArray.length; i++){

            data[ i ] = Integer.parseInt(stringArray[ i ]);
        }

        bubble_sort(data , data.length);

        for( int value : data){
            System.out.println(value);
        }

    }



    public static int[] bubble_sort(int data[], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (data[i] > data[j]) {
                    int temp;
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }

        }
        return data;
    }

}