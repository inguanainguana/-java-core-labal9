package labal_task;

public class ListFromTailForExample5 {
    public static void main(String[] args) {
        System.out.println("Создание списка С ХВОСТА:");

        // Example4 выступает, как Node. По ошибке записала его, как задание № 4
        Example4 head = null;
        Example4 tail = null;

        for (int i = 1; i <= 5; i++) {
            Example4 newNode = new Example4(i, null);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            System.out.println("Добавили " + i + ", хвост теперь: " + tail.value);
        }

        System.out.print("Итоговый список: ");
        Example4 current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
