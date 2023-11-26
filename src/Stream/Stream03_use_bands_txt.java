package Stream;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream03_use_bands_txt {


    //拿到Bands.txt裡的樂團名字. 他的名字自元長度要大於13
    public static void main(String[] args) throws IOException {


        Stream<String> bands01 = Files.lines(Paths.get("bands.txt"), StandardCharsets.UTF_8);
        Stream<String> bands02 = Files.lines(Paths.get("bands.txt"), StandardCharsets.UTF_8);

        bands01.sorted()
                .filter(bandsname -> bandsname.length() > 13)
                .forEach(System.out::println);
        bands01.close();

        System.out.println("-----------------------------------------");

        List<String> bandList = bands02
                .filter(bandsname -> bandsname.contains("on"))
                .collect(Collectors.toList());    //用collect方法把過濾結果存成一個集合並且送到變數(bandList)裡面

        bandList.forEach(bandsname -> System.out.println(bandsname));

    }
}
