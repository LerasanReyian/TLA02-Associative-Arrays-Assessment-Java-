package lerasan_hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Lerasan_HashMap {

    public static void main(String[] args) {
        // Declare a HashMap to store student names and their scores
        HashMap<String, Integer> Scores = new HashMap<>();

        // Add at least five student names and scores
        Scores.put("Alice", 85);
        Scores.put("John", 90);
        Scores.put("Mark", 78);
        Scores.put("Sofia", 92);
        Scores.put("Emma", 88);

        Scanner sc = new Scanner(System.in);

        // Ask the user for a student's name and retrieve their score
        System.out.print("Enter the student's name: ");
        String name = sc.nextLine();
        if (Scores.containsKey(name)) {
            System.out.println(name + "'s score is: " + Scores.get(name));
        } else {
            System.out.println("Student not found.");
        }

        // Allow the user to update a student's score
        System.out.print("Enter the student's name to update score: ");
        name = sc.nextLine();
        if (Scores.containsKey(name)) {
            System.out.print("Enter the new score for " + name + ": ");
            int newScore = sc.nextInt();
            Scores.put(name, newScore);
            System.out.println("Score updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
        System.out.println(" ");

        // Print all student names and their scores
        System.out.println("List of students and their scores: ");
        for (String k : Scores.keySet()) {
            System.out.print(k + "-");
            System.out.println( Scores.get(k));
        }

        sc.close();
    }
}
