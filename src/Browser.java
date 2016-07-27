import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by rokon on 7/20/16.
 */
public class Browser {

    public static void main(String[] args) {

        Random random = new Random();

        Map<String, List<String>> listMap = IntStream.range(1, 100).mapToObj(operand -> {
            int next = random.nextInt(100) + 1;
            if (next > 25) {
                return ("GOOD");
            } else {
                return ("BAD");
            }
        }).collect(Collectors.groupingBy(s -> s));

        listMap.forEach((s, strings) -> {
            System.out.println(s+" : "+ strings.size());
        });



        String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik"};
        List<String> collect = IntStream.range(0, names.length)
                .filter(i -> names[i].length() <= i)
                .mapToObj(i -> names[i])
                .collect(Collectors.toList());

        System.out.println(collect);

//        int next = random.nextInt(100) + 1;
//
//        if (next>25){
//            System.out.println("GOOD");
//        }else {
//            System.out.println("BAD");
//        }

        //converting stirng to bytes

        String str = "Hello world";
        byte[] bytes = str.getBytes();
        //or
        byte[] bytesInUtf8 = str.getBytes(Charset.forName("UTF-8"));
    }
}
