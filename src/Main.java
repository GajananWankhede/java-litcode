import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
          List<String> list = new ArrayList<>();
          list.add("Pune");
        list.add("Mumbai");
        list.add("Bangluru");
        list.add("Delhi");
        list.add("Nagpur");
        list.add("Indore");

        Map<Character, Long> charFrequency = list.stream()
                .flatMapToInt(String::chars) //IntStream
                .mapToObj(c -> (char) c)     //Stream<Character>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charFrequency);

    }
}