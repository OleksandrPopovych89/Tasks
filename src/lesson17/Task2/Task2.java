/*
Lesson 17, task 2:

Ввести з клавіатури 5 чисел та заповнити ними список.
Вивести їх у зворотному порядку.
Використовувати лише цикл for.
*/

package lesson17.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            try {
                integers.add(Integer.parseInt(reader.readLine()));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                i--;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Reversed: ");
        for (int i = integers.size() - 1; i >= 0; i--) {
            System.out.println(integers.get(i));
        }
    }
}
