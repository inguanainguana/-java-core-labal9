package labal_task;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число для перевода в двоичную систему: ");
        int number = in.nextInt();

        System.out.print("Результат: ");
        if (number == 0) {
            System.out.print(0);
        } else {
            toBinary(number);
        }
        System.out.println();
    }

    public static void toBinary(int n) {
        if (n > 0) {
            toBinary(n / 2);
            System.out.print(n % 2);
        }
    }
}
