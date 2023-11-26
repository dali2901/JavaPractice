package Stream;

import java.util.stream.Stream;

public class Stream01 {


    public static void main(String[] args) {


        Stream.of("DJohn", "Achi", "PRoot")
                .sorted()
                .forEach(s -> System.out.println(s));

        System.out.println("----------------------------------------");


        String[] lab4_names = {"Shan", "DJohn", "Achi", "PRoot", "Momo", "Mak"};

        Stream.of(lab4_names)    // <- 這行也可以寫 Array.stream( lab4_names)
                .sorted()
                .forEach(name -> System.out.println(name));

        System.out.println("----------------------------------------");


        // 接下來要用Stream找到  lab4_names 這個String陣列裡面 M開頭的人
        Stream.of(lab4_names)
                .filter(name -> name.startsWith("M"))      // lombda 內部 name.startsWith()方法 裡面 return true的name 就會通過 filter傳回來
                .forEach(name -> System.out.println(name));


    }


}
