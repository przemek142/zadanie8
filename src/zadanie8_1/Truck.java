package zadanie8_1;

public class Truck extends Car {
    // Truck dziedzicząca po Car – posiada dodatkowo informację o wadze ładunku
    private double cargoWeight; //kg
    private final double meanACGasUsagePer100km=1.6;

    public Truck(String name, double gasTankCap, double meanGasUsagePer100km, boolean ACState, double cargoWeight) {
        super(name, gasTankCap, meanGasUsagePer100km, ACState);
        this.cargoWeight = cargoWeight;
    }


    public double getCargoWeight() {
        return cargoWeight;
    }

//    Jeśli klimatyzacja jest włączona, to samochód spala o 0,8l na 100km więcej, a ciężarówka o 1,6l na 100km więcej.
//    Dodatkowo ciężarówka spala o 0,5l paliwa na 100km więcej dla każdych dodatkowych 100kg ładunku.


    @Override
    public double range() {
        if (!isACstate())
            return 100 * getGasTankCap() / getMeanGasUsagePer100km();
        else
            return 100 * getGasTankCap() / (getMeanGasUsagePer100km() + meanACGasUsagePer100km + (0.5 * cargoWeight / 100));
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", pojemność baku: " + getGasTankCap() + ", śr. zuż. pal: " +
                getMeanGasUsagePer100km() + ",ładunek: " + cargoWeight + ", AC: " + isACstate() + ", spal AC: " + meanACGasUsagePer100km + ", zasięg: " + range();
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
