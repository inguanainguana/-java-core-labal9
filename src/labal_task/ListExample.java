package labal_task;

public class ListExample {
    public static void main(String[] args) {
        Example4 head = new Example4(1, null);

        Example4 second = new Example4(2, null);
        head.next = second;

        Example4 third = new Example4(3, null);
        second.next = third;

        System.out.println("Создан список:");
        Example4 current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
