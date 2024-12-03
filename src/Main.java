import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Выберети задание ");
            System.out.println("1 - задание №_1");
            System.out.println("2 - задание №_2");
            System.out.println("3 - задание №_3");
            System.out.println("0 - Выход");
            number = scanner.nextInt();
            if (number == 1) {
                Task_1.task_1();
            } else if (number == 2) {
                Task_2.task_2();
            } else if (number == 3) {
                Task_3.task_3();
            } else if (number == 0) {
                break;
            } else {
                System.out.println("Вы ввели неверное значение!");
            }
        }
    }
}