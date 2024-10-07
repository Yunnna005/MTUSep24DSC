import java.util.Iterator;
import java.util.LinkedList;

public class Lab02 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("May")) {
                names.add("Ray");
            }
            if (it.next().equalsIgnoreCase("Jay")) {
                names.remove("Jay");
            }
        }
    }
}
