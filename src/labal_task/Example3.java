package labal_task;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите " + size + " элементов массива:");
        fillArray(arr, 0, in);

        System.out.print("Ваш массив (выведено рекурсией): ");
        printArray(arr, 0);
        System.out.println();
    }


    public static void fillArray(int[] arr, int in, Scanner sc) {
        if (in < arr.length) {
            arr[in] = sc.nextInt();
            fillArray(arr, in + 1, sc);
        }
    }


    public static void printArray(int[] arr, int in) {
        if (in < arr.length) {
            System.out.print(arr[in] + " ");
            printArray(arr, in + 1);
        }
    }
}
