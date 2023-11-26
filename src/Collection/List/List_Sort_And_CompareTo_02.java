package Collection.List;


import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.*;

//如果List是自定義的物件 要用sort 怎麼辦

//Conclusion
//        當要對List進行sort,若為一般型態(e.g Integer,String…)則可以直接使用,但若型態為自定義class,則要實作comparator來給出誰跟誰比的定義.

public class List_Sort_And_CompareTo_02 {

    public static void main(String[] args) {

//        List personList = Arrays.asList(
//                new Person("Achi", 5000, true),
//                new Person("PRoot", 500, false),
//                new Person("DJohn", 50, false)
//        );
//
//        Collections.sort(personList);

        //Output
        //執行上面 personList 這段程式碼，結果會跳出 : ClassCastException
        //因為Collection並不知道要sort自定義物件的哪一個property  (i.e name? or monry? or marry?)，拿去做排序


//        Collections的sort()方法要求被排序的物件，必須實作java.lang.Comparable介面，
//        因此我用下方Ninja 實作Comparable介面
//        這個介面有個compareTo()方法 會必須傳回大於0、等於0或小於0的數，


        List<Ninja> ninjaList01 = Arrays.asList(
                new Ninja("Momo", 10, false),
                new Ninja("Shan", 100, false),
                new Ninja("PonPon", 5, true)
        );


        Collections.sort(ninjaList01);


        System.out.println(ninjaList01.toString());


//        for (Ninja ninja : ninjaList01) {
//            System.out.println(ninja.name + " " + ninja.level + " " + ninja.marry);
//
//        }

//        Collections的sort()方法，在取得a物件跟b物件進行比較時，
//        會先用a物件扮演（Cast）為Comparable（也因此若物件沒實作Comparable，將會拋出ClassCastException，若使用了泛型宣告，編譯器會檢查出型態不符），
//        然後呼叫a.compareTo(b)，如果a物件順序上小於b物件，必須傳回小於0，若順序上相等則傳回0，若順序上a大於b則傳回大於0的值。


//        若在實際情況中無法修改物件或無法取的原始碼，而無法實作Comparable呢？(e.g String為final物件無法被繼承)
//
//        Collections的sort()方法有另一個重載版本，可接受java.util.Comparator介面的實作物件，如果你使用這個版本，排序方式將根據Comparator的compare()定義來決定
//         所以下方 new 一個 Comparator<Ninja>

        List<Ninja> ninjaList02 = Arrays.asList(
                new Ninja("Momo", 10, false),
                new Ninja("Shan", 100, false),
                new Ninja("PonPon", 5, true)
        );

        Collections.sort(ninjaList02, new Comparator<Ninja>() {
            @Override
            public int compare(Ninja a, Ninja b) {
                return a.level - b.level;
            }
        });
        for (Ninja ninja : ninjaList02)
            System.out.println(ninja.level);

    }
}


// 自定義一個Person物件
class Person {

    private String name;
    private int money;
    private boolean marry;

    public Person(String name, int money, boolean marry) {
        this.name = name;
        this.money = money;
        this.marry = marry;
    }

}

class Ninja implements Comparable<Ninja> {

    protected String name;
    protected int level;
    protected boolean marry;

    public Ninja(String name, int level, boolean marry) {
        this.name = name;
        this.level = level;
        this.marry = marry;
    }

    //繼承 Comparable 必須實作 compareTo方法
    @Override
    public int compareTo(Ninja ninja) {
        return this.level - ninja.level;
    }

    @Override
    public String toString() {
        return "Ninja's Name = " + name + "     Ninja's Level =" + level + "        Ninja's Marry or Not = " + marry +"\n";
    }
}
