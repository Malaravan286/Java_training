import java.util.*;
public class MinMaxStream { public static void main(String[] args) { List<Integer> numbers = Arrays.asList(45, 12, 89, 34); int min = numbers.stream().min(Integer::compareTo).orElse(0); int max = numbers.stream().max(Integer::compareTo).orElse(0); System.out.println("Min: " + min); System.out.println("Max: " + max); } }
