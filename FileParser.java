import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

public class FileParser {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Change to your file's path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] eq = line.split(" ");
                
                int A = Integer.parseInt(eq[0]);
                double r = Double.parseDouble(eq[1])/100;
                int n = Integer.parseInt(eq[2]);
                int t = Integer.parseInt(eq[3]);

                double denom = 1 + r / n;
                int exp = n * t;

                System.out.println((int) Math.ceil(A / Math.pow(denom, exp)));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}