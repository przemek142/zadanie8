package zadanie8_1;

public class Vehicle {
    // nazwa, pojemność baku, średnie spalanie na 100km
    private String name;
    private double gasTankCap;
    private double meanGasUsagePer100km;

    public Vehicle(String name, double gasTankCap, double meanGasUsagePer100km) {
        this.name = name;
        this.gasTankCap = gasTankCap;
        this.meanGasUsagePer100km = meanGasUsagePer100km;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGasTankCap() {
        return gasTankCap;
    }

    public void setGasTankCap(double gasTankCap) {
        this.gasTankCap = gasTankCap;
    }

    public double getMeanGasUsagePer100km() {
        return meanGasUsagePer100km;
    }

    public void setMeanGasUsagePer100km(double meanGasUsagePer100km) {
        this.meanGasUsagePer100km = meanGasUsagePer100km;
    }

}
