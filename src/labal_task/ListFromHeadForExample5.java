package labal_task;

public class ListFromHeadForExample5 {
    public static void main(String[] args) {
        System.out.println("Создание списка С ГОЛОВЫ:");

        // Example4 выступает, как Node. По ошибке записала его, как задание № 4
        Example4 head = null;

        for (int i = 5; i >= 1; i--) {
            head = new Example4(i, head);
            System.out.println("Добавили " + i + ", голова теперь: " + head.value);
        }


        System.out.print("Итоговый список: ");
        Example4 current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
