import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class lambdaTest {
    public static void main(String[] args) {
        example1();
        example2();
    }


    public static void example1() {
        new Thread(() -> System.out.println("this is first example")).start();

    }

    public static void example2() {
        List<String> features = Arrays.asList("aaaaa", "bbbbbb", "cccccccc");

        features.forEach(f -> System.out.println(f));

        features.forEach(System.out::println);
    }

    public static void example3() {
        List names = Arrays.asList("aaaa", "bbbbb", "cccccc", "dddd");

        filter(names, (str)->str.startsWith("a"));
    }

    public static void filter(List<String> names, Predicate condition) {
        for (String name: names) {
            if (condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }
}
