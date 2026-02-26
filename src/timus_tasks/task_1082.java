package timus_tasks;
import java.io.PrintWriter;
import java.util.Scanner;

public class task_1082 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            if (i > 0) out.print(" ");
            out.print(i + 1);
        }
        out.println();
        out.flush();
    }
}
