import java.util.Base64;

public class String_Base64_Encode_Decode {

    public static void main(String[] args) {


        String str = "hello world";

// Base64編碼
        byte[] encodedBytes = Base64.getEncoder().encode(str.getBytes());
        String encodedStr = new String(encodedBytes);
        System.out.println(encodedStr); // aGVsbG8gd29ybGQ=

// Base64解碼
        byte[] decodedBytes = Base64.getDecoder().decode(encodedStr.getBytes());
        String decodedStr = new String(decodedBytes);
        System.out.println(decodedStr); // hello world
    }
}
