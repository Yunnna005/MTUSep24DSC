package Lab04;
import Linkedlist.CP3LinkedList;


public class Test_CP3LinkedList{
    public static void main(String[] args) {
        CP3LinkedList<Integer> list = new CP3LinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        System.out.println("Size of the linked list: " + list.size());
        list.print();
    }


}
