package lesson19.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/
public class Task1 {
    public static void main(String[] args) throws IOException {

        int n;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter n number: ");
        n = Integer.parseInt(bufferedReader.readLine());

        List<Integer> list = new ArrayList<>();

        getIntegerList(list, n, bufferedReader);

        System.out.println("Minimum value is: " + getMinimum(list));


    }

    public static void getIntegerList(List<Integer> list, int n, BufferedReader reader) throws IOException {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " element: ");
            list.add(Integer.parseInt(reader.readLine()));
        }
    }

    public static int getMinimum(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i));
        }
        return min;
    }
}
