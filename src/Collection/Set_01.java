package Collection;

import java.util.*;

public class Set_01 {


    public static void main(String[] args) {

        //Set<>  掛號裡放這個集合的class
        //Set是一個Interface而不是一般class 所以不能寫 new Set();
        //Set 沒有特定順序  而且不像List能用index對她進行操作


        System.out.println("========下方選擇三種不同的Set========");

        Set<String> lab4_set = new HashSet<>();
//        Set<String> lab4_set = new LinkedHashSet<>();
//        Set<String> lab4_set = new TreeSet<>();

        //HashSet無順序，查找速度快 ，比TreeSet快
        //LinkedHashSet 有順序 ( 依照你add方法的先後順序 )
        //TreeSet 也排序性(依照字母)



        lab4_set.clear();  // Set.clear方法 可以一次清空整個Set

        lab4_set.add("DJohn");
        lab4_set.add("Pete");
        lab4_set.add("Acky");
        lab4_set.add("Acky");
        lab4_set.add("Acky");
        lab4_set.add("Green");
        lab4_set.remove("Green"); //Set.remove方法 可以移除Green的資料

        System.out.println(lab4_set);  //輸出[Pete, DJohn,  Acky]  //  Acky只有一筆因為Set不重複



        System.out.println(lab4_set.size());        //Set.size()方法 可以印出Set大小
        System.out.println(lab4_set.contains("Acky"));  //輸出true //Set.contains方法 可以知道此資料有沒有在Set裡面
        System.out.println(lab4_set.isEmpty()); //輸出false   //Set.isEmpty方法 可以印出Set是不是空的


        System.out.println("========For迴圈遍歷Map========");

        for( String name : lab4_set){
            System.out.println(name);
        }

        System.out.println("========Lambda語法========");

        lab4_set.forEach(System.out::println);

        System.out.println("========Iterator迭代器遍歷Set========");

        Iterator<String> lab4_iterator =  lab4_set.iterator();
        while (lab4_iterator.hasNext()){
            System.out.println(lab4_iterator.next());
        }
    }
}
