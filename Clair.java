import java.io.*;
import java.util.*;

public class Clair {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < T; i++){
            int x = Integer.parseInt(sc.nextLine());
            ArrayList<Integer> np = new ArrayList<Integer>();
            np.add(1);
            
            for(int j = 2; j < x; j++){
                if (x % j == 0) {   // this is all factor of x
                    for (int k = 2; k <= j / 2; k++){
                        if (j % k == 0 && !np.contains(j)) np.add(j);
                    }
                }
            }
            
            np.add(x);
            
            for(int l = 0; l < np.size()-1; l++){
              System.out.print(np.get(l) + ", ");
            }
            System.out.print(np.get(np.size()-1));
            System.out.println();
        }
    }
}