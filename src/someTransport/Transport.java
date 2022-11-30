package someTransport;

import mechanics.Mechanics;
import sponsors.Sponsor;
import someDrivers.Drivers;

import java.util.HashSet;
import java.util.Set;

public abstract class Transport {


    private final String brand;
    private final String model;
    private final float engineVolume;

    private Drivers <?> driver;
    private final Set<Sponsor> sponsors = new HashSet<>();
    private final Set<Mechanics> mechanics = new HashSet<>();
    public Transport(String brand, String model, float engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "данные не указаны";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "данные не указаны";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public void addSponsor(Sponsor sponsor){
        this.sponsors.add(sponsor);
    }
    public void addMechanics(Mechanics mechanic){
        this.mechanics.add(mechanic);
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanics> getMechanics() {
        return mechanics;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public abstract void startDriving();
    public abstract void endDriving();
}
