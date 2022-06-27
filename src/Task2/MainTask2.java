package Task2;/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
*/


import java.util.ArrayList;

public class MainTask2 {
    public static void main(String[] args) {

        Human child1 = new Human("Egor", true, 12);
        Human child2 = new Human("Stepan", true, 14);
        Human child3 = new Human("Svitlana", false, 10);

        Human father = new Human("Sergiy", true, 41, child1, child2, child3);
        Human mother = new Human("Olena", true, 40, child1, child2, child3);

        Human grandfather1 = new Human("Oleg", true, 60, father);
        Human grandmother1 = new Human("Olga", false, 58, father);

        Human grandfather2 = new Human("Stepan", true, 63, mother);
        Human grandmother2 = new Human("Kate", false, 60, mother);

    }
}
