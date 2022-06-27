/*
Есть коллекция HashMap<String, String>, туда занесли 3 различные пары.
При помощи метода printKeys:
Вывести на экран список ключей, каждый элемент с новой строки.
*/

package lesson19.Task6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Taras", "Shevchenko");
        map.put("Lesya", "Ukrainka");
        map.put("Ivan", "Kotliarevsky");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        System.out.println("First method:");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
        }
        System.out.println("Second method:");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey());
        }
        System.out.println("Third method:");
        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }
}
