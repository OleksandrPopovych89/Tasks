
/*
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/
package lesson19.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Task3 {
    public static void main(String[] args) throws IOException {

        int n = 10;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> list = new ArrayList<>();

        getIntegerList(list, n, bufferedReader);

        System.out.println("Maximum value is: " + getMinimum(list));


    }

    public static void getIntegerList(List<Integer> list, int n, BufferedReader reader) throws IOException {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " element: ");
            list.add(Integer.parseInt(reader.readLine()));
        }
    }

    public static int getMinimum(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        return max;
    }
}
