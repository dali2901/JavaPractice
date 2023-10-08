import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Try {


    public static void main(String[] args) {


        Map<String,Integer> map01 = new HashMap<>();

        map01.put("djohn",1);
        map01.put("PROOT",2);
        map01.put("achi",3);

        Set<Map.Entry<String, Integer>> entries = map01.entrySet();
        Set<String>keySet =map01.keySet();
        Stream<String> keysStream = keySet.stream();
        System.out.println(keysStream);

    }
}
