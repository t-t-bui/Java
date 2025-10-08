import java.io.*;
import java.util.*;

public class Ariel {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        while(sc.hasNextLine()){
            String [] y;
            y = sc.nextLine().split(" ");
            System.out.println(Integer.parseInt(y[0]) + Integer.parseInt(y[1]));
        }
    }
}