import java.util.*;
public class ListReverseAndShuffle { public static void main(String[] args) { List<String> names = new ArrayList<>(Arrays.asList("Asha", "Bala", "Charu", "Deepak")); Collections.reverse(names); System.out.println("Reverse: " + names); Collections.shuffle(names); System.out.println("Shuffle: " + names); } }
