package Homework4.Task1;

public abstract class Animal {
    protected String kind;
    protected String type;

    protected Animal(String kind, String type) {
        this.kind = kind;
        this.type = type;
    }

    protected abstract void sound();
}
