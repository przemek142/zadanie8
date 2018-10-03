package zadanie8_1;

public class Main {
    public static void main(String[] args) {

        Car[] cars= new Car[4];

        cars[0] = new Car("car1", 100, 8.1, false);
        cars[1] = new Truck("car2", 200, 7.2, false,1000);
        cars[2] = new Car("car3", 60, 14, false);
        cars[3] = new Truck("car4", 500, 5.5, false, 2000);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (int i = 0; i < cars.length; i++) {
            cars[i].setACstate(true);
        }
        System.out.println("AC:ON");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
