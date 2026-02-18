package labal_tasks;

public class task_5 {
    public static int fib(int n) {
        System.out.print(" -> " + n);

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Последовательность вызовов для числа Фибоначчи(5):");
        int result = fib(5);
        System.out.println("\nРезультат: " + result);
    }
}
