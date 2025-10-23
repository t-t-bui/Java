import java.util.*;
import java.io.*;

public class Krishna{
	public static void main(String[] args){
		try(BufferedReader  reader = new BufferedReader(new FileReader("krishna.txt"))){
			int line;
			line = Integer.parseInt(reader.readLine());

			for(; line > 0; line--){
				String[] str = reader.readLine().split(" ");
				int start = Integer.parseInt(str[0]);
				int end = Integer.parseInt(str[1]);
				int sum = 0;

				for(int x = start; x <= end; x++){
					for(int i = 1; i <= x; i++){
						sum += i;
					}
				}

				System.out.println(sum);
			}
		} catch (IOException e) {
		System.err.println("Error reading file: " + e.getMessage());
		}
	}
}