// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример
// 1+2
// 3
// +4
// 7
// Отмена
// 3
// *3
// 9

import java.util.Scanner;
import java.util.Stack;

public class task_3 {
    static void calc(Stack<Integer> st, String sign) {
        int res = 0;
        int num_2 = st.pop();
        int num_1 = st.pop();
        switch (sign) {
            case ("+"):
                res = num_1 + num_2;
                System.out.printf("%d + %d = %d\n", num_1, num_2, res);
                st.push(num_1);
                st.push(res);
                break;
            case ("-"):
                res = num_1 - num_2;
                System.out.printf("%d - %d = %d\n", num_1, num_2, res);
                st.push(num_1);
                st.push(res);
                break;
            case ("*"):
                res = num_1 * num_2;
                System.out.printf("%d * %d = %d\n", num_1, num_2, res);
                st.push(num_1);
                st.push(res);
                break;
            case ("/"):
                if (num_2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                    break;
                }
                res = num_1 / num_2;
                System.out.printf("%d / %d = %d\n", num_1, num_2, res);
                st.push(num_1);
                st.push(res);
                break;

        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        st.push(iScanner.nextInt());
        System.out.print(
                "Введите + для сложения\nВведите - для вычитания\nВведите * для умножения\nВведите / для деления\n");
        String choice = iScanner.next();
        System.out.println("Введите второе число: ");
        st.push(iScanner.nextInt());
        calc(st, choice);
        while (true) {
            System.out.println("Выберите следующее действие:\n1-Отмена операции\n2-Следующая операция\n3-Выход");
            String action = iScanner.next();
            if (action.equals("1")) {
                st.pop();
            }
            if (action.equals("3")) {
                iScanner.close();
                break;
            }
            System.out.println("Первое число: " + st.peek());
            System.out.print(
                    "Введите + для сложения\nВведите - для вычитания\nВведите * для умножения\nВведите / для деления\n");
            choice = iScanner.next();
            System.out.println("Введите второе число: ");
            st.push(iScanner.nextInt());
            calc(st, choice);
        }

    } 
}
