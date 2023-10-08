package Java_Practice;


//編寫一個名為“intersection”的函數，該函數接受 2 個array of integers，並返回一個包含 2 個array交集的array。


import java.util.ArrayList;

public class NO15_intersaction交集 {

    public static int[]  intersection( int[] arr1 , int[] arr2){

        ArrayList<Integer> arrayList = new ArrayList<>();


        for (int i=0; i< arr1.length; i++){
            for (int j=0; j< arr2.length; j++){

                if (arr1[ i ] == arr2[ j ] ){
                    arrayList.add(arr1[i]);
                }
            }
        }

        int[] result = new int[arrayList.size()];
        for (int i=0; i<result.length; i++){

            result[i] = arrayList.get(i);
        }
        return result;
    }



    public static void main(String[] args) {


     int[] result =   intersection(new int[] {1, 3, 4, 6, 10,100}, new int[] {5, 11, 4, 3, 100, 144, 0});

     for ( int i : result){
         System.out.print("{"+i+"}");
     }
    }
}
