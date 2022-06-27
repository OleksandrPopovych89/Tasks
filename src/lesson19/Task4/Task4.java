/*
Задача: Ввести с клавиатуры 5 слов и выведи их в алфавитном порядке.
*/
package lesson19.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        String words;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter approximate five words and turn enter: ");
            words = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<String> list = new ArrayList<>();

        String[] strings = words.split(" ");

        for (String string : strings) {
            list.add(string);
        }
        Collections.sort(list);
        list.forEach(System.out::println);

    }
}
