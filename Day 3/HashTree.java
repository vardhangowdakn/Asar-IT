import java.util.*;

public class HashTree {
    public static void main(String[] args) {
        TreeMap<Integer, String> leaderboard = new TreeMap<>();

        leaderboard.put(85, "Vardhan");
        leaderboard.put(92, "Rahul");
        leaderboard.put(78, "Raghu");
        leaderboard.put(95, "Nanu");

        System.out.println("\nLeaderBoard: ");
        for (Map.Entry<Integer, String> entry : leaderboard.entrySet()) {
            System.out.println("Score: " + entry.getKey() + "->" + entry.getValue());

        }

        System.out.println(
                "\nTop Performer: " + leaderboard.lastEntry().getValue() + " With the score " + leaderboard.lastKey());
        System.out.println("Lowest Performer: " + leaderboard.firstEntry().getValue() + " With the score: "
                + leaderboard.firstKey());

        leaderboard.remove(78);
        System.out.println("\nRemoved: " + leaderboard.get(78) + "Score 78");

        System.out.println("\nUpdated leader board");
        for (Map.Entry<Integer, String> entry : leaderboard.entrySet()) {
            System.out.println("Score: " + entry.getKey() + "->" + entry.getValue());

        }

        System.out.println("\nIs there a participant with 88: " + leaderboard.containsKey(88));

        System.out.println("Is Sana present: " + leaderboard.containsValue("sana"));

        leaderboard.clear();
        System.out.println("Leaderboard cleared: " + leaderboard);

    }

}

// OutPut

// LeaderBoard:
// Score: 78->Raghu
// Score: 85->Vardhan
// Score: 92->Rahul
// Score: 95->Nanu

// Top Performer: Nanu With the score 95
// Lowest Performer: Raghu With the score: 78

// Removed: nullScore 78

// Updated leader board
// Score: 85->Vardhan
// Score: 92->Rahul
// Score: 95->Nanu

// Is there a participant with 88: false
// Is Sana present: false
// Leaderboard cleared: {}
