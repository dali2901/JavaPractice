package Stream;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream02 {


    public static void main(String[] args) {

        //把Array 每個元素拿去開平方再做平均
        Arrays.stream(new int [] {2,4,6,8,10})
                .map( n -> n*n)
                .average()
                .ifPresent(System.out::println);


        // 用ArrayList做String 不能用Stream.of() , 而是直接用Stream
        ArrayList<String> people = new ArrayList<>();
        people.add("Proot");
        people.add("Djohn");
        people.add("Achi");
        people.add("EggBro");
        people.add("eggBro");

        people.stream()
                .map(name -> name.toLowerCase())
                .filter(name -> name.startsWith("e"))
                .forEach(System.out::println);


    }
}

