package Lab02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab02_Q2{
    public static void main(String[] args) {
        HashSet<String> hashSet_names = new HashSet<>();
        TreeSet<String> treeSet_names = new TreeSet<>();

        hashSet_names.add("Kay");
        hashSet_names.add("Jay");
        hashSet_names.add("May");
        hashSet_names.add("Fay");

        treeSet_names.add("Kay");
        treeSet_names.add("Jay");
        treeSet_names.add("May");
        treeSet_names.add("Fay");

        hashSet_names.add("Kay");
        treeSet_names.add("Jay");

        System.out.println("Display HashSet");
        displayNames(hashSet_names);
        System.out.println("\n\nDisplay TreeSet");
        displayNames(treeSet_names);
    }

    public static void displayNames(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}