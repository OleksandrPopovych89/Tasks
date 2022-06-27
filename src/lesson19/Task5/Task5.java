/*
Создать коллекцию HashMap<String, String>, занести туда 4 пары строк
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода:
ключ - значение
ключ - значение
ключ - значение
ключ - значение
*/

package lesson19.Task5;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Popovych", "Oleksandr");
        map.put("Shevchenko", "Valerii");
        map.put("Zabroda", "Sergiy");
        map.put("Finger", "John");

        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
