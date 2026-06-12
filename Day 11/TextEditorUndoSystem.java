import java.util.*;
public class TextEditorUndoSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); Stack<String> actions = new Stack<>();
        System.out.print("Number of edits: "); int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) { System.out.print("Edit action: "); actions.push(sc.nextLine()); }
        System.out.println("Undo order:"); while (!actions.empty()) System.out.println("Undo " + actions.pop()); sc.close();
    }
}
