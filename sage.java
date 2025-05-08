import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class sage {
    public static void main(String[] args) {
        String filePath = "sage.txt"; // Change to your file's path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            TreeMap<String, Integer> treeMap = new TreeMap<>();

            while ((line = reader.readLine()) != null) {
                String[] strArr = line.split(" ");
                treeMap.put(strArr[0], Integer.parseInt(strArr[1]));
            }

            double average = 0;
            int heightest = 0;
            int lowest = 100;
            for (int score : treeMap.values()) {
                average += score;

                if(score > heightest) {
                    heightest = score;
                }

                if(score < lowest) {
                    lowest = score;
                }
            }

            average /= treeMap.size();

            System.out.printf("Average score: %.2f\n", average);
            System.out.println("\tHighest score: " + heightest);

            System.out.println("\t\tStudents with hightest score: ");

            for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
                String name = entry.getKey();
                int score = entry.getValue();

                if(score == heightest) {
                    System.out.println("\t\t\t" + name);
                }
            }

            System.out.println("\t\tStudents with lowest score: ");

            for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
                String name = entry.getKey();
                int score = entry.getValue();

                if(score == lowest) {
                    System.out.println("\t\t\t" + name);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
