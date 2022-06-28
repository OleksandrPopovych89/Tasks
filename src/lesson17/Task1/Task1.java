/*
Lesson 17, task 1:

Програма вводить рядки, доки користувач не введе порожній рядок (натиснувши клавішу enter).
Згодом програма будує новий список. Якщо в рядку парне число букв, рядок подвоюється, якщо непарне – потроюється.
Програма відображає вміст нового списку на екрані.
Приклад введення:
Кіт
Коти
Я
Приклад висновку:
Кіт Кіт Кіт
Коти Коти
Я Я Я
*/
package lesson17.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        String temp;

        while (true) {
            temp = reader.readLine();
            if (temp.isEmpty() == false) {
                list.add(temp);
            } else {
                break;
            }
        }
        for (String s : list) {
            if (s.length() % 2 == 0) {
                System.out.println(s + " " + s);
            } else {
                System.out.println(s + " " + s + " " + s);
            }
        }
    }
}
