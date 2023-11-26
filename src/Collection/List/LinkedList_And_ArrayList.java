package Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_And_ArrayList {

    //  LinkedList 跟 ArrayList 都實作 List Interface

    //  LinkedList 的資料結構是Node(節點)  每個節點會有Pointer(一個Reference) 指向下一個Node
    //  每一個被指向的Node也有一個Pointer(一個Reference) 指回前一個Node

    // ArrayList 底層也是用Array  --> Array宣告時要宣告大小且固定，ArrayList 不用，雖有預設長度 但可以動態擴增大小

    //當資料量很大且要快速時， 不常修改且要取得元素要用ArrayList，要新增要刪除用LinkedList

    public static void main(String[] args) {


        LinkedList<String>  name_linkedList = new LinkedList<>();

        name_linkedList.add("Achi");
        name_linkedList.add("Djohn");
        name_linkedList.add("BoogEddie");
        name_linkedList.add("Spencer");

        System.out.println(name_linkedList.get(2));  // 用 LinkedList.get()方法+ 索引值 得到該元素
        name_linkedList.add(1,"Momo");  // 用add()方法加入元素，要輸入索引值，元素

        ArrayList<String> name_arrayList = new ArrayList<>();

        name_arrayList.add("Achi");
        name_arrayList.add("Djohn");
        name_arrayList.add("BoogEddie");
        name_arrayList.add("Spencer");
        System.out.println(name_arrayList);
        System.out.println(name_arrayList.get(2));


        // 跟 上面一樣 .get()方法+ 索引值 得到該元素  但 兩個雖得到一樣的值， 後面運作方式卻不一樣， ArrayList 用的是 Array
        //Array 有一個 Random Access的特性， 超級快，你請JAVA 拿第1個元素給你 跟 你請JAVA拿第 5000個元素給你 作用時間是一樣的

        //但在 LinkedList中 Java 會從最開頭或最結尾開始找，如果你想拿中間的元素，他要一個一個照順序從頭或尾巴找，所以比ArrayList慢

        name_arrayList.add(1,"Momo");
        // 相反地，LinkedList 比 ArrayList 快的是 add() 跟 remove()方法，add()方法時，LinkedList只要把 箭頭指向新加入的元素的頭跟尾巴，remove()方法時只要拿掉就可以了
        // ArrayList 會創造一個新陣列
        // EX如果要新加入Momo  則  原本  {"Achi", "Djohn", "BoogEddie", "Spencer"}   -->    {"Achi", ,"      "，"Djohn", "BoogEddie", "Spencer"}
        //創造一個陣列後再加入Momo --> 則 {"Achi", ,"Momo"，"Djohn", "BoogEddie", "Spencer"}




    }


}
