package Homework6.Task5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static javafx.application.Platform.exit;

public class AutoShop {
    private String manufacture;
    private String model;
    private long year;
    private double volume;
    private float price;

    private AutoShop(String manufacture, String model, long year, double volume, float price) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.volume = volume;
        this.price = price;
    }

    private AutoShop() {
    }

    private String getManufacture() {
        return manufacture;
    }

    private void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    private String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private long getYear() {
        return year;
    }

    private void setYear(long year) {
        this.year = year;
    }

    private double getVolume() {
        return volume;
    }

    private void setVolume(double volume) {
        this.volume = volume;
    }

    private float getPrice() {
        return price;
    }

    private void setPrice(float price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<AutoShop> list = new HashSet<>();

        AutoShop car1 = new AutoShop("Ford", "Focus", 2011, 1.3, 3056);
        AutoShop car2 = new AutoShop("Opel", "Corsa", 2016, 1.8, 5055);
        AutoShop car3 = new AutoShop("Mini", "Cooper", 2018, 2.2, 10069);
        list.add(car1);
        list.add(car2);
        list.add(car3);


        while (true) {
            System.out.println("Choose the option:\n1 - Add new car;\n2 - Get car info;\n3 - Buy car;\n4 - Get information about whole list\n5 - STOP");
            int idt = in.nextInt();
            switch (idt) {
                case 1:
                    list.add(addcar());
                    break;
                case 2:
                    getInfo(list);
                    break;
                case 3:
                    list.remove(buyCar(list));
                    break;
                case 4:
                    getAllList(list);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid data. enter one more time");
                    break;
            }
        }
    }

    private static AutoShop addcar() {
        Scanner in = new Scanner(System.in);
        AutoShop car = new AutoShop();
        System.out.println("Enter Manufacture:");
        car.setManufacture(in.nextLine());
        System.out.println("Enter Model:");
        car.setModel(in.nextLine());
        System.out.println("Enter year:");
        car.setYear(in.nextLong());
        System.out.println("Enter volume:");
        car.setVolume(in.nextDouble());
        System.out.println("Enter price:");
        car.setPrice(in.nextFloat());
        System.out.println();
        return car;
    }

    private static void getInfo(Set<AutoShop> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Manufacture that you want to know about:");
        String str = in.nextLine();
        int i = 0;
        for (AutoShop s : list) {
            i++;
            if (s.getManufacture().equalsIgnoreCase(str)) {
                System.out.println("Manufacture: " + s.getManufacture() + ", Model: "
                        + s.getModel() + ", Year: " + s.getYear() + ", Volume:" + s.getVolume() + "Price: " + s.getPrice());
            } else if (i == list.size()) System.out.println("Not found");
        }
        System.out.println();
    }

    private static AutoShop buyCar(Set<AutoShop> list) {
        Scanner in = new Scanner(System.in);
        AutoShop exit = new AutoShop();
        System.out.println("Enter Manufacture that you want to buy:");
        String str = in.nextLine();
        int i = 0;
        for (AutoShop s : list) {
            i++;
            if (s.getManufacture().equalsIgnoreCase(str)) {
                System.out.println();
                return s;
            } else if (i == list.size()) {
                System.out.println("Not found");
            }
        }
        System.out.println();
        return exit;
    }

    private static void getAllList(Set<AutoShop> list) {
        for (AutoShop s : list) {
            System.out.println("Manufacture: " + s.getManufacture() + ", Model: "
                    + s.getModel() + ", Year: " + s.getYear() + ", Volume:" + s.getVolume() + "Price: " + s.getPrice());
        }
        System.out.println();
    }
}
