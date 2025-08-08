import java.util.*;

public class ARRAYDEQUE {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();

        history.addFirst("Home");
        history.addFirst("About");
        history.addFirst("Services");

        System.out.println("Going back from: " + history.removeFirst());

        history.addFirst("Contact");

        System.out.println("Next page (peek): " + history.peekFirst());

        System.out.println("Current History:");
        for (String page : history) {
            System.out.println("- " + page);
        }

        System.out.println("Total pages: " + history.size());
        System.out.println("Is history empty: " + history.isEmpty());

        history.clear();
        System.out.println("After clearing: " + history);
    }
}

// output

// Going back from: Services
// Next page (peek): Contact
// Current History:
// - Contact
// - About
// - Home
// Total pages: 3
// Is history empty: false
// After clearing: []
