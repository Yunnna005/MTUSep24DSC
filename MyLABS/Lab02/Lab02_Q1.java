package Lab02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lab02_Q1 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            String currentName = iterator.next();
            if (currentName.equals("May")) {
                iterator.add("Ray");
            }
        }

        names.remove("Jay");

        System.out.println("Names in the list from the beginning:");
        iterator = names.listIterator();
        DisplayNames(names);

        System.out.println("\nNames in the list from the end:");
        DisplayNamesPrevious(names);

        names.add("Kay");
        System.out.println("\nLinked List after adding Kay");
        DisplayNames(names);

    }

    public static void DisplayNames(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void DisplayNamesPrevious(LinkedList<String> list) {
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
