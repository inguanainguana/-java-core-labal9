package timus_tasks;
import java.util.Scanner;

public class task_1563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        String[] shops = new String[n];

        for (int i = 0; i < n; i++) {
            shops[i] = in.nextLine();
        }

        int bayanCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (shops[i].equals(shops[j])) {
                    bayanCount++;
                    break;
                }
            }
        }

        System.out.println(bayanCount);

        in.close();
    }
}
