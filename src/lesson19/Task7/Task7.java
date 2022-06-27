
/*
Есть коллекция HashMap<String, String>, туда занесли 3 различные пары.
При помощи метода printValues:
Вывести на экран список значений, каждый элемент с новой строки.
*/
package lesson19.Task7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Taras", "Shevchenko");
        map.put("Lesya", "Ukrainka");
        map.put("Ivan", "Kotliarevsky");

        printValues(map);

    }

    public static void printValues(Map<String, String> map) {
        System.out.println("First method: ");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getValue());
        }
        System.out.println("Second method: ");
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("Third method: ");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getValue());
        }
    }
}
