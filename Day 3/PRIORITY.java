import java.util.*;

class Ticket {
    String issue;
    int urgency;

    public Ticket(String issue, int urgency) {
        this.issue = issue;
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "Issue: " + issue + " (Urgency: " + urgency + ")";
    }
}

public class PRIORITY {
    public static void main(String[] args) {
        PriorityQueue<Ticket> ticketQueue = new PriorityQueue<>(Comparator.comparingInt(t -> t.urgency));

        ticketQueue.add(new Ticket("Website down", 1));
        ticketQueue.offer(new Ticket("Password reset", 3));
        ticketQueue.add(new Ticket("Email not working", 2));
        ticketQueue.add(new Ticket("Login issue", 2));
        ticketQueue.offer(new Ticket("Server slow", 1));
        System.out.println("Top Priority (peek): " + ticketQueue.peek());

        System.out.println("Total Tickets: " + ticketQueue.size());
        System.out.println("Is Queue Empty? " + ticketQueue.isEmpty());

        System.out.println("Contains 'Login issue': (Manual Check): ");
        for (Ticket t : ticketQueue) {
            if (t.issue.equals("Login issue")) {
                System.out.println("Yes, found: " + t);
            }
        }

        System.out.println("\nAll Tickets (order not guaranteed):");
        for (Ticket ticket : ticketQueue) {
            System.out.println("- " + ticket);
        }

        System.out.println("\nProcessing Tickets by Priority:");
        while (!ticketQueue.isEmpty()) {
            System.out.println("Processing → " + ticketQueue.poll());
        }

        ticketQueue.clear();
        System.out.println("\nQueue after clear: " + ticketQueue);
    }
}

// output

// Top Priority (peek): Issue: Website down (Urgency: 1)
// Total Tickets: 5
// Is Queue Empty? false
// Contains 'Login issue': (Manual Check):
// Yes, found: Issue: Login issue (Urgency: 2)

// All Tickets (order not guaranteed):
// - Issue: Website down (Urgency: 1)
// - Issue: Server slow (Urgency: 1)
// - Issue: Email not working (Urgency: 2)
// - Issue: Password reset (Urgency: 3)
// - Issue: Login issue (Urgency: 2)

// Processing Tickets by Priority:
// Processing ? Issue: Website down (Urgency: 1)
// Processing ? Issue: Server slow (Urgency: 1)
// Processing ? Issue: Login issue (Urgency: 2)
// Processing ? Issue: Email not working (Urgency: 2)
// Processing ? Issue: Password reset (Urgency: 3)

// Queue after clear: []
