//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    public static void enqueue(LinkedList<Integer> ll, int n) {
        ll.addLast(n);
        System.out.printf("Элемент %d был добавлен в очереди\n", n);
        System.out.println("Ваша очередь: " + ll);
    }

    public static void dequeue(LinkedList<Integer> ll) {
        System.out.printf("Элемент %d был удален из очереди\n", ll.removeFirst());
        System.out.println("Ваша очередь: " + ll);
    }

    public static void first(LinkedList<Integer> ll) {
        System.out.println("Первый элемент в очереди: " + ll.peekFirst());
        System.out.println("Ваша очередь: " + ll);
    }

    public static void work(LinkedList<Integer> ll) {
        boolean flag = true;
        Scanner iScanner = new Scanner(System.in);
        while (flag) {
            System.out.println(
                    "Какую операцию вы хотите выполнить?\n1-Добавление элемента в конец очереди\n2-Возвращение первого элемента и удаление\n3-Возвращение первого элемента без удаления\n4- Выход ");
            String choice = iScanner.nextLine();
            switch (choice) {
                case ("1"):
                    System.out.println("Введите число для добавления: ");
                    String input = iScanner.nextLine();
                    int n = Integer.parseInt(input);
                    enqueue(ll, n);
                    break;
                case ("2"):
                    dequeue(ll);
                    break;
                case ("3"):
                    first(ll);
                    break;
                case ("4"):
                    flag = false;
                    iScanner.close();
                    break;
            }
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
        work(ll);

    } 
}
