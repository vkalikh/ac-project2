package Homework4.Task1;

public class Dog extends Animal implements Relationship {
    private String name;

    public Dog(String kind, String family, String name) {
        super(kind, family);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sound() {
        System.out.println("Gav");
    }

    @Override
    public void eat(String name) {
        System.out.println("Dog eats " + name);
    }

    @Override
    public void eaten(String name) {
    }

    @Override
    public void move() {
        System.out.println("Dog moves");
    }
}
