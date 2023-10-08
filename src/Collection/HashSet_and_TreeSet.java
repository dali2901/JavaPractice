package Collection;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_and_TreeSet {


    public static void main(String[] args) {

       Set<String> names1 = new HashSet<>();

        names1.add("DJOHN");
        names1.add("PETE");
        names1.add("ACKY");
        names1.add("JACK");
        names1.add("DJOHN");

        System.out.println(names1);


        Set<String> names2 = new TreeSet<>();

        names2.add("DJOHN");
        names2.add("PETE");
        names2.add("ACKY");
        names2.add("JACK");
        names2.add("DJOHN");

        System.out.println(names2);


    }
}
