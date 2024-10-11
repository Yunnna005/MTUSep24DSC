package Lab02;

import java.io.File;
import java.util.*;

public class Lab02_Q4 {
    public static void main(String[] args) {
        String file_name = "C:\\Users\\Anna\\IdeaProjects\\MTUSep24DSC\\MyLABS\\Lab02\\hamlet.txt";
        Map<String, Set<Integer>> map = new HashMap<String, Set<Integer>>();
        try {
            Scanner sc = new Scanner(new File(file_name));
            int lineNum = 1;
            while (sc.hasNextLine()) {
                Scanner input = new Scanner(sc.nextLine());
                input.useDelimiter("[^A-Za-z0-9]+");
                while (input.hasNext()) {
                    String word = input.next().toLowerCase();
                    if (map.containsKey(word)) {
                        map.get(word).add(lineNum);
                    }else{
                        Set<Integer> set = new HashSet<Integer>();
                        set.add(lineNum);
                        map.put(word, set);
                    }
                    System.out.println("''" + word + "''"); // print only the word
                }
            }
            lineNum++;
            sc.close();
            for (Map.Entry<String, Set<Integer>> entry : map.entrySet()) {
                System.out.println("Word: " + entry.getKey() + ", Line Numbers: " + entry.getValue());
            }
            String searchWord = "to";
            if (map.containsKey(searchWord)) {
                System.out.println("The word '" + searchWord + "' is found on lines: " + map.get(searchWord));
            } else {
                System.out.println("The word '" + searchWord + "' is not found in the file.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
