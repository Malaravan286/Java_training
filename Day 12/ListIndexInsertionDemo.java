import java.util.*;
public class ListIndexInsertionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); List<String> names = new ArrayList<>(Arrays.asList("Anu", "Bala", "Charu"));
        System.out.print("Index: "); int index = sc.nextInt(); sc.nextLine(); System.out.print("Name: "); String name = sc.nextLine(); names.add(index, name); System.out.println(names); sc.close();
    }
}
