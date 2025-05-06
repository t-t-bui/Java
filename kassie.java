import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class kassie {
    public static void main(String[] args) {
        String filePath = "kassie.txt"; // Path to the input file
        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = Integer.parseInt(br.readLine()); // Read the first line (number of lines to read)

            for(int i = 0; i < lineCount; i++) {
                line = br.readLine(); // Read the next 5 lines
                
                String [] parts = line.split(" ");
                switch (parts[1]) {
                    case "-":
                        System.out.println(Integer.parseInt(parts[0]) - Integer.parseInt(parts[2]));
                        break;
                    case "+":
                        System.out.println(Integer.parseInt(parts[0]) + Integer.parseInt(parts[2]));
                        break;
                    case "*":  
                        System.out.println(Integer.parseInt(parts[0]) * Integer.parseInt(parts[2]));
                        break;
                    case "/":
                        System.out.println(Integer.parseInt(parts[0]) / Integer.parseInt(parts[2]));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String content = contentBuilder.toString();
        System.out.println(content);
    }
}