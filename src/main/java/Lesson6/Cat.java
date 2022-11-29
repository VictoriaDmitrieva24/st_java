package Lesson6;

import java.util.HashSet;

import static java.lang.System.out;

public class Cat {

    // поля для класса cat:
    int age;
    String name;
    String color;

    // конструктор для класса cat:
    public Cat(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Cat cat = new Cat(5, "Ben", "black"); // выделяется память на класс Cat
        Cat cat1 = new Cat(4, "Den", "white");
        Cat cat2 = new Cat(5, "Gena", "black");

        System.out.println(cat);

        HashSet<Cat> hashCat= new HashSet();
        hashCat.add(cat);
        hashCat.add(cat1);
        hashCat.add(cat2);

        for (Cat s: hashCat) {
            out.println(s);
        }
    }

    // конструктор для переопределения метода
    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true; // любой объект должен быть равен себе
         if (o == null || getClass() != o.getClass()) return false;
         Cat cat = (Cat) o;
         return age == cat.age;
     }

    @Override
    public int hashCode() {
        return age;
    }


}
