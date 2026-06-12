import java.util.*; import java.util.stream.*;
public class EvenNumbersStream { public static void main(String[] args) { List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8); List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()); System.out.println(even); } }
