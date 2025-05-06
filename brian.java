import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class brian {
	public static void main(String[] args){
		String filePath = "brian.dat"; // Change to your file's path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            String init = reader.readLine();

            for (int i = 0; i < Integer.parseInt(init); i++){

            	line = reader.readLine();

            	String[] strInt = line.split(" ");
            	int[] intArr = new int[strInt.length];

            	for(int j = 0; j < strInt.length; j++){
            		intArr[j] = Integer.parseInt(strInt[j]);
            	}

            	TreeMap<String, TreeMap<String, Integer>> treeMap = new TreeMap<>();

            	while ((line = reader.readLine()) != null) {
            		System.out.println(line);
            		String[] strArr = line.split(" ");
                	for(String str: strArr){
                		System.out.print(i + " ");
                	}
                	System.out.println();
            	}
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
	}
}