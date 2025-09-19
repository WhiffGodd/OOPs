//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Define Car as a separate class
class Car {
    int year;
    String color;

    public void displayInfo() {
        System.out.println("The year of car: " + year);
        System.out.println("The color of car: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Car info");

        Car wagonr = new Car();
        Car gwagon = new Car();

        wagonr.year = 1996;
        wagonr.color = "White";

        gwagon.year = 2016;
        gwagon.color = "Black";

        wagonr.displayInfo();
        gwagon.displayInfo();
    }
}
