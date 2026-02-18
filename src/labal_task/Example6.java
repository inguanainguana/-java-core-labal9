package labal_task;
import java.util.*;


public class Example6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");
        map.put(3, "Dragonfruit");
        map.put(4, "Elderberry");
        map.put(5, "Fig");
        map.put(6, "Grapefruit");
        map.put(7, "Honeydew");
        map.put(8, "Iceberg");
        map.put(9, "Jackfruit");

        System.out.println("Строки с ключом > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
            }
        }


        System.out.print("\nКлюч = 0: ");
        if (map.containsKey(0)) {
            System.out.println(map.get(0));
        }

        long product = 1;
        boolean found = false;
        System.out.print("\nКлючи строк с длиной > 5: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                System.out.print(entry.getKey() + " ");
                product *= entry.getKey();
                found = true;
            }
        }

        System.out.println("\nИтоговое произведение этих ключей: " + (found ? product : 0));
    }
}