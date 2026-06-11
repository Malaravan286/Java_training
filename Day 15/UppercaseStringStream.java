import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStringStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "python", "c++", "javascript");

        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase strings: " + uppercaseNames);
    }
}
