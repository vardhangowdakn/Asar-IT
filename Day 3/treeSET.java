import java.util.*;

public class treeSET {
    public static void main(String[] args) {
        TreeSet<Integer> rollNumbers = new TreeSet<>();

        rollNumbers.add(105);
        rollNumbers.add(101);
        rollNumbers.add(108);
        rollNumbers.add(102);
        rollNumbers.add(101);

        System.out.println("Sorted Roll Numbers:");
        for (int roll : rollNumbers) {
            System.out.println(roll);
        }

        System.out.println("\nIs 102 present? " + rollNumbers.contains(102));

        rollNumbers.remove(105);
        System.out.println("After removing 105: " + rollNumbers);

        System.out.println("First Roll: " + rollNumbers.first());
        System.out.println("Last Roll: " + rollNumbers.last());

        System.out.println("Total: " + rollNumbers.size());
        rollNumbers.clear();
        System.out.println("After clearing: " + rollNumbers);
    }
}

//output

// Sorted Roll Numbers:
// 101
// 102
// 105
// 108

// Is 102 present? true
// After removing 105: [101, 102, 108]
// First Roll: 101
// Last Roll: 108
// Total: 3
// After clearing: []
