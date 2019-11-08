package Homework4.Task1;

public class Cat extends Animal implements Relationship {
    private String name;

    public Cat(String kind, String family, String name) {
        super(kind, family);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void eat(String name) {
        System.out.println("Cat eats " + name);
    }

    @Override
    public void eaten(String name) {
        System.out.println("Cat were eaten by " + name);
    }

    @Override
    public void move() {
        System.out.println("Cat moves");
    }
}
