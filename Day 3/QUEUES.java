import java.util.*;

public class QUEUES {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Document1");
        queue.add("Document2");
        queue.add("Document3");

        System.out.println("Next to print: " + queue.peek());

        System.out.println("Printing: " + queue.poll());

        System.out.println("Remaining in queue:");
        for (String doc : queue) {
            System.out.println("- " + doc);
        }

        System.out.println("Is queue empty: " + queue.isEmpty());
        System.out.println("Total remaining: " + queue.size());

        queue.clear();
        System.out.println("Queue cleared: " + queue);
    }
}

// output

// Next to print: Document1
// Printing: Document1
// Remaining in queue:
// - Document2
// - Document3
// Is queue empty: false
// Total remaining: 2
// Queue cleared: []
