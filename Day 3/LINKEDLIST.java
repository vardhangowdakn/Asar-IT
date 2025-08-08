import java.util.*;

public class LINKEDLIST {

    public static void main(String[] args) {
        LinkedList<String> platform = new LinkedList<>();

        platform.add("Train#101-Express");
        platform.add("Train#102-Local");
        platform.add("Train#103-InterCity");

        platform.addFirst("Train#100-Medical Emergency");

        System.out.println("Trains at Platform");
        for (String train : platform) {
            System.out.println("-" + train);
        }

        System.out.println("\n Next to depart: " + platform.getFirst());

        System.out.println("Departed: " + platform.removeFirst());
        System.out.println("Departed" + platform.remove());

        System.out.println("Removed for maintainance" + platform.removeLast());

        System.out.println("\n Remaining Trains at Platform:");
        for (int i = 0; i < platform.size(); i++) {
            System.out.println((i + 1) + ". " + platform.get(i));
        }

        System.out.println("\n Total trains: " + platform.size());
        System.out.println(" Is 'Train#102 - Local' present:  " + platform.contains("Train#102 - Local"));

        platform.clear();
        System.out.println("Platform cleared: " + platform);
    }
}

// output

// Trains at Platform
// -Train#100-Medical Emergency
// -Train#101-Express
// -Train#102-Local
// -Train#103-InterCity

// Next to depart: Train#100-Medical Emergency
// Departed: Train#100-Medical Emergency
// DepartedTrain#101-Express
// Removed for maintainanceTrain#103-InterCity

// Remaining Trains at Platform:
// 1. Train#102-Local

// Total trains: 1
// Is 'Train#102 - Local' present: false
// Platform cleared: []