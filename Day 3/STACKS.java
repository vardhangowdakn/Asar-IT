import java.util.*;

public class STACKS {
    public static void main(String[] args) {
        Stack<String> actions = new Stack<>();

        actions.push("Typed Hello");
        actions.push("Inserted Image");
        actions.push("Bolded Text");
        System.out.println("Last Action: " + actions.peek());

        System.out.println("Undoing: " + actions.pop());

        System.out.println("Remaining actions:");
        for (String action : actions) {
            System.out.println("- " + action);
        }

        System.out.println("Total actions: " + actions.size());
        System.out.println("Is undo stack empty: " + actions.isEmpty());

        actions.clear();
        System.out.println("After clearing: " + actions);
    }
}

// output

// Last Action: Bolded Text
// Undoing: Bolded Text
// Remaining actions:
// - Typed Hello
// - Inserted Image
// Total actions: 2
// Is undo stack empty: false
// After clearing: []
