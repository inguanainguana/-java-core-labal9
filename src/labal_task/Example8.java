package labal_task;
import java.util.Scanner;

public class Example8 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Создание списка с головы (3 элемента)");
        Node head = createHead();
        System.out.println("Список: " + toString(head));

        System.out.println("\nДобавление 10 в начало и 100 в конец");
        head = AddFirst(head, 10);
        AddLast(head, 100);
        System.out.println("Список: " + toString(head));

        System.out.println("\nВставка 55 на позицию 2");
        Insert(head, 55, 2);
        System.out.println("Список: " + toString(head));

        System.out.println("\nУдаление с головы и с хвоста");
        head = RemoveFirst(head);
        RemoveLast(head);
        System.out.println("Список: " + toString(head));

        System.out.println("\n Рекурсивный вывод");
        System.out.println("Строка (рек): " + toStringRec(head));
    }


    public static Node createHead() {
        Node head = null;
        System.out.print("Введите количество элементов: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Значение: ");
            head = new Node(sc.nextInt(), head);
        }
        return head;
    }


    public static Node createTail() {
        System.out.print("Введите количество элементов: ");
        int n = sc.nextInt();
        if (n == 0) return null;

        System.out.print("Значение: ");
        Node head = new Node(sc.nextInt(), null);
        Node tail = head;

        for (int i = 1; i < n; i++) {
            System.out.print("Значение: ");
            tail.next = new Node(sc.nextInt(), null);
            tail = tail.next;
        }
        return head;
    }


    public static String toString(Node head) {
        StringBuilder sb = new StringBuilder();
        Node ref = head;
        while (ref != null) {
            sb.append(ref.value).append(" ");
            ref = ref.next;
        }
        return sb.toString().trim();
    }


    public static Node AddFirst(Node head, int newValue) {
        return new Node(newValue, head);
    }


    public static void AddLast(Node head, int newValue) {
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = new Node(newValue, null);
    }


    public static void Insert(Node head, int newValue, int k) {
        Node ref = head;
        int count = 1;
        while (ref.next != null && count < k) {
            ref = ref.next;
            count++;
        }
        Node newNode = new Node(newValue, ref.next);
        ref.next = newNode;
    }


    public static Node RemoveFirst(Node head) {
        return head.next;
    }


    public static void RemoveLast(Node head) {
        if (head == null || head.next == null) return;
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }


    public static void Remove(Node head, int k) {
        Node ref = head;
        int count = 1;
        while (ref.next != null && count < k) {
            ref = ref.next;
            count++;
        }
        if (ref.next != null) {
            ref.next = ref.next.next;
        }
    }


    public static Node createHeadRec(int n) {
        if (n == 0) return null;
        System.out.print("Значение: ");
        return new Node(sc.nextInt(), createHeadRec(n - 1));
    }


    public static Node createTailRec(Node current, int n) {
        if (n == 0) return null;
        System.out.print("Значение: ");
        Node newNode = new Node(sc.nextInt(), null);
        if (current != null) current.next = newNode;
        createTailRec(newNode, n - 1);
        return newNode;
    }


    public static String toStringRec(Node head) {
        if (head == null) return "";
        return head.value + " " + toStringRec(head.next);
    }
}
