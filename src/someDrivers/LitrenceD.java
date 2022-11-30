package someDrivers;

import someTransport.Buss;

public class LitrenceD {
    private String lic = "D";
    Buss buss;

    public LitrenceD(Buss buss) {
        this.buss = buss;
    }

    public String getLic() {
        return lic;
    }

    public Buss getBuss() {
        return buss;
    }

    @Override
    public String toString() {
        return buss.getBrand() + " " + buss.getModel();
    }

}
