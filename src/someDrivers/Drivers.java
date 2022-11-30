package someDrivers;

public class Drivers <L> {
    private String fullName;
    private L driverLicense;
    private int experience;

    public Drivers(String fullName, L driverLicense, int experience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public L getDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void startDriving() {
        System.out.println(this.fullName + " начинает заезд.");
    }

    public void stop() {
        System.out.println(this.fullName + " совершает остановку.");
    }

    public void refuel(){
        System.out.println(this.fullName + " дозаправляет свое авто");
    }

    @Override
    public String toString() {
        return "Водитель " + this.fullName + " управляет " + driverLicense.toString() + " и будет участвовать в заезде." ;
    }
}
