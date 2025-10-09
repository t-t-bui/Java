import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int names = Integer.parseInt(sc.nextLine());
        String s = "";
        Map<String, String> groups = new HashMap<String, String>();
        ArrayList<String[]> groupee = new ArrayList<String[]>();
        Map<String, ArrayList<String>> x = new HashMap<String, ArrayList<String>>();
        
        for(int i = 0; i < names; i++){
            String[] name = sc.nextLine().split(" ");
            groups.put(name[0], name[1]);
            groupee.add(name);
        }
        
        for(int i = 0; i < groupee.size(); i++){
            helper(groupeep[i], groups, build);
        }
    }
                  
    public static void helper(String name, Map<String, String> groups, String build){
        if(x.contains(name)){
            build = groups.get(name);
            helper(group.get(name), groups, build);
        }
        
        System.out.println(build);
    }
}