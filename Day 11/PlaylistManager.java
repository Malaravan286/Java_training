import java.util.*;
public class PlaylistManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); ArrayList<String> playlist = new ArrayList<>();
        System.out.print("Songs count: "); int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) { System.out.print("Song: "); playlist.add(sc.nextLine()); }
        Collections.sort(playlist); System.out.println("Sorted playlist: " + playlist); sc.close();
    }
}
