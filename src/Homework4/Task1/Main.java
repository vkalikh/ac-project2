package Homework4.Task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("всеядный", "кошачьих", "Tomas");
        Dog dog = new Dog("плотоядный", "псовых", "Rax");
        Mouse mouse = new Mouse("травоядный", "мышиных", "Mini");

        mouse.sound();
        cat.move();
        cat.eat(mouse.getName());
        mouse.eaten(cat.getName());

        cat.sound();
        dog.move();
        dog.eat(cat.getName());
        cat.eaten(dog.getName());
        dog.sound();
    }
}
