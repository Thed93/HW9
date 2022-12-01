package someDrivers;

import someTransport.FreightCar;

public class LitrenceC {
    private String lic = "C";
    FreightCar freightCar;

    public LitrenceC(FreightCar freightCar) {
        this.freightCar = freightCar;
    }

    public String getLic() {
        return lic;
    }

    public FreightCar getFreightCar() {
        return freightCar;
    }
    @Override
    public String toString() {
        return freightCar.getBrand() + " " + freightCar.getModel();
    }
}
