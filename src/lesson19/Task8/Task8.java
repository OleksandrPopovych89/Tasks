
/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 5 различных чисел.
При помощи метода  removeAllNumbersMoreThan10 удалить из множества все числа больше 10.
*/
package lesson19.Task8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {

        Set<Integer> integers = new HashSet<>();
        integers.add(4);
        integers.add(2);
        integers.add(40);
        integers.add(60);
        integers.add(11);

        System.out.println("Source set: ");
        integers.forEach(System.out::println);

        deleteBiggestThatLimit(10, integers);

        System.out.println("Set after removing over limit numbers: ");
        integers.forEach(System.out::println);


    }

    public static void deleteBiggestThatLimit(int limit, Set<Integer> set) {

        //First method:
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > limit) {
                iterator.remove();
            }
        }
        //Second method:
        set.removeIf(integer -> integer > limit);
    }
}

