import java.io.*;
import java.util.*;

public class Georgio {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int loop = Integer.parseInt(sc.nextLine());
        boolean isPrime = true;
        
        for(int i = 0; i < loop; i++){
            int divisor = 2;
            int prime = Integer.parseInt(sc.nextLine());
            
            for (;divisor <= prime / 2; divisor++){
                if(prime % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime) System.out.println("Optimal Prime");
            else System.out.println("Mega Dumb");
        }
    }
}