package Collection.List;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class List_Sort_And_CompareTo_01 {

    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>();
        myList.add(500);
        myList.add(50);
        myList.add(5000);
        myList.add(5);

        Collections.sort(myList);

        for( int num : myList){
            System.out.println( num);
        }

        //Output:
        //5
        //50
        //500
        //5000   可見Sort方法可從小排到大




    }


}
