package lesson19.Task2;/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
*/


public class MainTask2 {
    public static void main(String[] args) {

        Human child1 = new Human("Egor", Sex.MALE, 12);
        Human child2 = new Human("Stepan", Sex.MALE, 14);
        Human child3 = new Human("Svitlana", Sex.FEMALE, 10);

        Human father = new Human("Sergiy", Sex.MALE, 41, child1, child2, child3);
        Human mother = new Human("Olena", Sex.FEMALE, 40, child1, child2, child3);

        Human grandfather1 = new Human("Oleg", Sex.MALE, 60, father);
        Human grandmother1 = new Human("Olga", Sex.FEMALE, 58, father);

        Human grandfather2 = new Human("Stepan", Sex.MALE, 63, mother);
        Human grandmother2 = new Human("Kate", Sex.FEMALE, 60, mother);


        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(grandfather1);
        System.out.println(grandmother1);

        System.out.println(grandfather2);
        System.out.println(grandmother2);

    }
}
