// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список

import java.util.LinkedList;

public class task_1 {
    public static void ReversLinkedList (LinkedList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            list.add(i, list.removeLast());
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(5);
        ll.add(12);
        ll.add(72);
        ll.add(8);
        System.out.println(ll);
        ReversLinkedList(ll);
        System.out.println(ll);
    }
}
