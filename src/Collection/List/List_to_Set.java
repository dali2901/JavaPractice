package Collection.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//如何把List丟到Set裡面，因為有時你不想要List的東西印出來是重複的

public class List_to_Set {


    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(1);
        numberList.add(2);
        numberList.add(2);
        numberList.add(3);
        numberList.add(3);
        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);  //很簡單粗被直接寫一個Set然後用Set.addAll()方法，把List丟進去
        System.out.println(numberSet);

//        上方可以這樣寫
//        Set<Integer> numberSet = new HashSet<>(numberList);
//        System.out.println(numberSet);
//        因為addAll()' call can be replaced with parametrized constructor call

    }
}
