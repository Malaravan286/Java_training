import java.util.*;
public class TrainReservationWaitingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); LinkedList<String> waitingList = new LinkedList<>();
        System.out.print("Passengers waiting: "); int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) { System.out.print("Passenger name: "); waitingList.addLast(sc.nextLine()); }
        System.out.println("Confirmed first passenger: " + waitingList.pollFirst()); System.out.println("Remaining waiting list: " + waitingList); sc.close();
    }
}
