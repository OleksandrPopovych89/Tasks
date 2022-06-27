package Task2;/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
*/


import java.util.ArrayList;

public class Human {
    private String name;
    private boolean sex;
    private int age;
    private ArrayList<Human> children = new ArrayList<>();

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.sex = gender;
        this.age = age;
    }

    public Human(String name, boolean gender, int age, Human... humans) {
        this.name = name;
        this.sex = gender;
        this.age = age;
        for (Human human : humans) {
            this.children.add(human);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return sex;
    }

    public void setGender(boolean gender) {
        this.sex = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender=" + sex +
                ", age=" + age +
                ", children=" + children +
                '}';
    }
}
