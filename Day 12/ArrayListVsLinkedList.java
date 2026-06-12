import java.util.*;
public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(); List<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) { arrayList.add(i); linkedList.add(i); }
        linkedList.add(0, 100); arrayList.add(100); System.out.println("ArrayList: " + arrayList); System.out.println("LinkedList: " + linkedList);
    }
}
