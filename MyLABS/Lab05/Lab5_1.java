package Lab05;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lab5_1 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Anna\\IdeaProjects\\MTUSep24DSC\\MyLABS\\Lab05\\Doc\\words_alpha.txt";
        int[] sizes = {10000,100000}; // List sizes to test
        int reps = 10000;

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                arrayList.add(line);
                linkedList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Number of words in ArrayList: " + arrayList.size());
        System.out.println("Number of words in LinkedList: " + linkedList.size());

        for (int size : sizes) {
            if (size > arrayList.size()) {
                System.out.println("Requested size exceeds available data.");
                break;
            }

            long startTime = System.nanoTime();
            for (int i = 0; i < reps; i++) {
                for (int j = 0; j < size; j++) {
                    arrayList.get(j);
                }
            }
            long elapsedArrayList = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            for (int i = 0; i < reps; i++) {
                for (int j = 0; j < size; j++) {
                    linkedList.get(j);
                }
            }
            long elapsedLinkedList = System.nanoTime() - startTime;

            System.out.printf("%s\t%s\t\t%s%n", "Size", "Elapsed Array List", "ElapsedLinkedList");
            System.out.printf("%d\t%d\t\t%d%n", size, elapsedArrayList, elapsedLinkedList);
        }
    }
}
