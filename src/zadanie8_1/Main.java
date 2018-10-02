package zadanie8_1;

public class Main {
    public static void main(String[] args) {

        Car[] cars= new Car[4];

        cars[0] = new Car("car1", 100, 20, false);
        cars[1] = new Truck("car2", 100, 10, false,100);
        cars[2] = new Car("car3", 100, 10, false);
        cars[3] = new Truck("car4", 100, 20, false, 200);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (int i = 0; i < cars.length; i++) {
            cars[i].setACstate(true);
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
