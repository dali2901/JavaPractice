package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_01 {

    // Map is just a Set of Key - Value Pair
    // Map 沒有特定順序 ，搜尋快
    //元素可重複，Key重複加入會覆蓋舊的值
    //HashMap查找速度慢，插入刪除速度快
    //TreeMap 有排序性


    public Map_01() {
        Map<String, Integer> lab4_map = new HashMap<>();

        lab4_map.put("DJohn", 3000);
        lab4_map.put("PRoot", 3000);
        lab4_map.put("Eddie", 3000);
        lab4_map.put("Achi", 3000);
        lab4_map.put("DJohn", 8000); // Map.put方法 如果Key已經有了 則會覆蓋過去
        lab4_map.replace("PRoot", 7777); // Map.replace方法 如果Key已經有在Map裡面則取代「值」，如果沒有則不會發生任何事情
        lab4_map.putIfAbsent("GangstaMak", 666);  // Map.putIfAbsent方法，如果Key存在於Map則不會發生事情，如果Key不存在Map則會新增此筆資料

        System.out.println(lab4_map);   // 會直接輸出 整張Map 如右  {GangstaMak=666, Eddie=3000, PRoot=7777, Achi=3000, DJohn=8000}

        System.out.println(lab4_map.keySet()); //輸出  [GangstaMak, Eddie, PRoot, Achi, DJohn]   // Map.keySet方法 可以取得Map所有Key

        lab4_map.remove("DJohn");  // Map.remove方法 可以移除DJohn的資料


        System.out.println(lab4_map.get("Achi"));   //輸出3000 //   Map.get方法 輸入Key 可以拿到Value //

        System.out.println(lab4_map.containsKey("DJohn")); // 輸出True  // Map.containKey方法 輸入 Key 可以知道此資料有沒有在Map裡面
        System.out.println(lab4_map.containsKey("Cola")); // 輸出False

        System.out.println(lab4_map.containsValue(3000)); // 輸出True // // Map.containValue方法 輸入 Value 可以知道此資料有沒有在Map裡面


        System.out.println("========For迴圈遍歷Map========");

        for (Map.Entry<String, Integer> lab4_entry : lab4_map.entrySet()) {
            System.out.println(lab4_entry.getKey() + " " + lab4_entry.getValue());

        }

        System.out.println("========ForEach遍歷Map========");

        lab4_map.forEach((lab4_name, lab4_income) -> {
            System.out.println(lab4_name + "  " + lab4_income);
        });

        System.out.println("========Iterator迭代器遍歷Map========");

        Iterator<Map.Entry<String,Integer>> lab4_iterator = lab4_map.entrySet().iterator();

        while (lab4_iterator.hasNext()){
            Map.Entry<String, Integer>entry = lab4_iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void main(String[] args) {

        new Map_01();

    }
}
