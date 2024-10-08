package Lab02;

import java.io.File;
import java.util.Scanner;

public class Lab02_Q3 {
    public static void main(String[] args) {
        String file_name = "C:\\Users\\Anna\\IdeaProjects\\MTUSep24DSC\\MyLABS\\Lab02\\hamlet.txt";
        try {
            Scanner sc = new Scanner(new File(file_name));
            int lineNum = 1;
            while (sc.hasNextLine()) {
                Scanner input = new Scanner(sc.nextLine());
                input.useDelimiter("[^A-Za-z0-9]+");
                while (input.hasNext()) {
                    String word = input.next();
                    System.out.println("''" + word + "''"); // print only the word
                }
            }
            sc.close(); // close sc after the while loop
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
