package labal_task;
import java.util.*;

public class Example7LinkedList {
    public static void main(String[] args) {
        int n = 50000;
        List<Integer> list = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        int in = 0;
        while (list.size() > 1) {

            in = (in + 1) % list.size();
            list.remove(in);
        }

        long end = System.currentTimeMillis();

        System.out.println("Результат (LinkedList): Остался №" + list.get(0));
        System.out.println("Время выполнения: " + (end - start) + " мс");
    }
}
