package timus_tasks;
import java.util.Scanner;

public class task_2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        boolean hasTriple = false;
        boolean allFives = true;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int grade = in.nextInt();
            sum += grade;

            if (grade == 3) {
                hasTriple = true;
            }

            if (grade != 5) {
                allFives = false;
            }
        }

        double average = (double) sum / n;

        if (hasTriple) {
            System.out.println("None");
        }
        else if (allFives) {
            System.out.println("Named");
        }
        else if (average >= 4.5) {
            System.out.println("High");
        }
        else {
            System.out.println("Common");
        }

        in.close();
    }
}
