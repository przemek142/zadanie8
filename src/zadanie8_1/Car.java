package zadanie8_1;

public class Car extends Vehicle {
    // dziedzicząca po Vehicle – posiada dodatkowo informację o tym, czy ma włączoną klimatyzację, czy nie
    private boolean ACstate; // 1- on, 0- off

    public boolean isACstate() {
        return ACstate;
    }


    public void setACstate(boolean ACstate) {
        this.ACstate = ACstate;
    }

    public Car(String name, double gasTankCap, double meanGasUsagePer100km, boolean ACState) {
        super(name, gasTankCap, meanGasUsagePer100km);
        this.ACstate = ACState;
    }

    public double range() {
        //    Jeśli klimatyzacja jest włączona, to samochód spala o 0,8l na 100km więcej, a ciężarówka o 1,6l na 100km więcej.
        //    Dodatkowo ciężarówka spala o 0,5l paliwa na 100km więcej dla każdych dodatkowych 100kg ładunku.

        if (!ACstate)
            return 100 * getGasTankCap() / getMeanGasUsagePer100km();
        else
            return 100 * getGasTankCap() / (getMeanGasUsagePer100km() + 0.8);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", pojemność baku: " + getGasTankCap() + ", śr. zuż. pal: " +
                getMeanGasUsagePer100km() + ", AC: " + isACstate() + ", zasięg: " + range();
    }
}
