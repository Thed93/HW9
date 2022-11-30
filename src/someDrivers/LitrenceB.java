package someDrivers;

import someTransport.Car;

public class LitrenceB {
    private String lic = "B";
    Car car;

    public LitrenceB(Car car) {
        this.car = car;
    }

    public String getLic() {
        return lic;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return car.getBrand() + " " + car.getModel();
    }
}
