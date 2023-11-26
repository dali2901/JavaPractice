package Stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Stream04_use_data_txt {

    public static void main(String[] args) throws IOException {


        //找到data裡面每一行的資料第一個整數值>15
        Stream<String> data01 = Files.lines(Paths.get("data.txt"), StandardCharsets.UTF_8);

        data01.map( data -> data.split(","))
                .filter(data -> data.length == 3)
                .filter(data -> Integer.parseInt(data[1])>15)
                .forEach(data -> System.out.println(data[0]+","+data[1]+","+ data[2]));

        data01.close();

    }

}
