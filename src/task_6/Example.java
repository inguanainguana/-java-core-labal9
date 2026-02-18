package task_6;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("СРАВНЕНИЕ ВРЕМЕНИ ВЫПОЛНЕНИЯ ОПЕРАЦИЙ (ВАРИАНТ 1)\n");

        System.out.println("Добавление в начало:");
        System.out.println("ArrayList: " + getAddFirstTime(arrayList) + " мс");
        System.out.println("LinkedList: " + getAddFirstTime(linkedList) + " мс");
        System.out.println("ArrayDeque: " + getAddFirstTimeDeque(arrayDeque) + " мс\n");

        System.out.println("Добавление в конец:");
        System.out.println("ArrayList: " + getAddLastTime(arrayList) + " мс");
        System.out.println("LinkedList: " + getAddLastTime(linkedList) + " мс");
        System.out.println("ArrayDeque: " + getAddLastTimeDeque(arrayDeque) + " мс\n");

        System.out.println("Добавление в середину (1000 элементов):");
        System.out.println("ArrayList: " + getAddMiddleTime(arrayList) + " мс");
        System.out.println("LinkedList: " + getAddMiddleTime(linkedList) + " мс");
        System.out.println("ArrayDeque: не поддерживается\n");

        System.out.println("Удаление из начала:");
        System.out.println("ArrayList: " + getRemoveFirstTime(arrayList) + " мс");
        System.out.println("LinkedList: " + getRemoveFirstTime(linkedList) + " мс");
        System.out.println("ArrayDeque: " + getRemoveFirstTimeDeque(arrayDeque) + " мс\n");

        System.out.println("Удаление из конца:");
        System.out.println("ArrayList: " + getRemoveLastTime(arrayList) + " мс");
        System.out.println("LinkedList: " + getRemoveLastTime(linkedList) + " мс");
        System.out.println("ArrayDeque: " + getRemoveLastTimeDeque(arrayDeque) + " мс\n");

        System.out.println("Получение по индексу (100000 операций):");
        System.out.println("ArrayList: " + getByIndexTime(arrayList) + " мс");
        System.out.println("LinkedList: " + getByIndexTime(linkedList) + " мс");
        System.out.println("ArrayDeque: не поддерживается");
    }

    private static long getAddFirstTime(List<Integer> list) {
        list.clear();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getAddFirstTimeDeque(Deque<Integer> deque) {
        deque.clear();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            deque.addFirst(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getAddLastTime(List<Integer> list) {
        list.clear();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getAddLastTimeDeque(Deque<Integer> deque) {
        deque.clear();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            deque.addLast(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getAddMiddleTime(List<Integer> list) {
        list.clear();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(50000, i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveFirstTime(List<Integer> list) {
        list.clear();
        for (int i = 0; i < 100000; i++) list.add(i);

        long start = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(0);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveFirstTimeDeque(Deque<Integer> deque) {
        deque.clear();
        for (int i = 0; i < 100000; i++) deque.add(i);

        long start = System.currentTimeMillis();
        while (!deque.isEmpty()) {
            deque.removeFirst();
        }
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveLastTime(List<Integer> list) {
        list.clear();
        for (int i = 0; i < 100000; i++) list.add(i);

        long start = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveLastTimeDeque(Deque<Integer> deque) {
        deque.clear();
        for (int i = 0; i < 100000; i++) deque.add(i);

        long start = System.currentTimeMillis();
        while (!deque.isEmpty()) {
            deque.removeLast();
        }
        return System.currentTimeMillis() - start;
    }

    private static long getByIndexTime(List<Integer> list) {
        list.clear();
        for (int i = 0; i < 100000; i++) list.add(i);

        Random rand = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(rand.nextInt(list.size()));
        }
        return System.currentTimeMillis() - start;
    }
}
