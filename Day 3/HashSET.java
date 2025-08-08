import java.util.*;

public class HashSET {
    public static void main(String[] args) {
        HashSet<String> books = new HashSet<>();

        books.add("Clean Code");
        books.add("Atomic Habits");
        books.add("Java Essentials");
        books.add("Clean Code");

        System.out.println("Contains 'Atomic Habits': " + books.contains("Atomic Habits"));

        books.remove("Java Essentials");
        books.add("Atomic Habits");

        System.out.println("Is library empty: " + books.isEmpty());

        System.out.println("Total books: " + books.size());

        System.out.println("Books in Library:");
        for (String book : books) {
            System.out.println("- " + book);
        }

        books.clear();
        System.out.println("After clearing: " + books);
    }
}

// output

// Contains 'Atomic Habits': true
// Is library empty: false
// Total books: 2
// Books in Library:
// - Atomic Habits
// - Clean Code
// After clearing: []
