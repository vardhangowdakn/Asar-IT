import java.util.*;

public class LINKEDHash {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> history = new LinkedHashMap<>();
        history.put(1, "Google");
        history.put(2, "YouTube");
        history.put(3, "Instagram");
        history.put(4, "StackOverflow");

        history.put(2, "YouTube (Revisited)");

        System.out.println(" Browsing History (in order):");
        for (Map.Entry<Integer, String> entry : history.entrySet()) {
            System.out.println("Page ID " + entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nDid user visit Instagram " + history.containsValue("Instagram"));

        history.remove(3);
        System.out.println("Removed ChatGPT from history");

        System.out.println("\nUpdated History:");
        for (Map.Entry<Integer, String> entry : history.entrySet()) {
            System.out.println("Page ID " + entry.getKey() + ": " + entry.getValue());
        }

        history.clear();
        System.out.println("\nCleared History: " + history);
    }
}

// output

// Browsing History (in order):
// Page ID 1: Google
// Page ID 2: YouTube (Revisited)
// Page ID 3: Instagram
// Page ID 4: StackOverflow

// Did user visit Instagram true
// Removed ChatGPT from history

// Updated History:
// Page ID 1: Google
// Page ID 2: YouTube (Revisited)
// Page ID 4: StackOverflow

// Cleared History: {}
