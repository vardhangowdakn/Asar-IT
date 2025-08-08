import java.util.*;

public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();

        books.add("One Piece");
        books.add("Clean Code");
        books.add("Dune");
        books.add("Game of Thrones");

        books.add(2, "Harry and Potter");

        System.out.println("Books Aavilable in Library");
        for (String book : books) {
            System.out.println("-" + book);

        }

        System.out.println("\nBookss at index 3:" + books.get(3));

        books.set(0, "Lord Of Rings");
        System.out.println("Updated first Book" + books.get(0));

        System.out.println("Contains 'Clean Code' :" + books.contains("Clean Code"));

        books.remove(4);
        books.remove("Dune");

        System.out.println("\nBooks After Removal");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + "." + books.get(i));

        }

        System.out.println("Total books: " + books.size());

        System.out.println("Is Library empty: " + books.isEmpty());

        books.clear();
        System.out.println("After clearing: " + books);
    }

}

// Books Aavilable in Library
// -One Piece
// -Clean Code
// -Harry and Potter
// -Dune
// -Game of Thrones

// Bookss at index 3:Dune
// Updated first BookLord Of Rings
// Contains 'Clean Code' :true

// Books After Removal
// 1.Lord Of Rings
// 2.Clean Code
// 3.Harry and Potter
// Total books: 3
// Is Library empty: false
// After clearing: []