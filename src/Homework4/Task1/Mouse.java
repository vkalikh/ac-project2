package Homework4.Task1;

public class Mouse extends Animal implements Relationship {
    private String name;

    public Mouse(String kind, String family, String name) {
        super(kind, family);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sound() {
        System.out.println("Pi");
    }

    @Override
    public void eat(String name) {

    }

    @Override
    public void eaten(String name) {
        System.out.println("Mouse were eaten by " + name);
    }

    @Override
    public void move() {
        System.out.println("Mouse moves");
    }
}
