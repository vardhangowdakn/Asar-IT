import java.util.*;

public class LinkedSET {
    public static void main(String[] args) {
        LinkedHashSet<String> apps = new LinkedHashSet<>();

        apps.add("Chrome");
        apps.add("VS Code");
        apps.add("Spotify");
        apps.add("WhatsApp");
        apps.add("VS Code");
        System.out.println("Is Spotify open? " + apps.contains("Spotify"));

        apps.remove("WhatsApp");

        System.out.println("Apps in use (in order):");
        for (String app : apps) {
            System.out.println("- " + app);
        }

        System.out.println("Total apps: " + apps.size());

        System.out.println("Is app list empty? " + apps.isEmpty());

        apps.clear();
        System.out.println("After clearing: " + apps);
    }
}

// output

// Is Spotify open? true
// Apps in use (in order):
// - Chrome
// - VS Code
// - Spotify
// Total apps: 3
// Is app list empty? false
// After clearing: []
