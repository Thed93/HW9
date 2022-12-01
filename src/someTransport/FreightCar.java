package someTransport;

public class FreightCar extends Transport implements Competing {

    public enum carryCapacity {N1(0,3.5d), N2(3.5d,12), N3(12,Double.POSITIVE_INFINITY);

        private double minMass;
        private double maxMass;

        carryCapacity(double minMass, double maxMass) {
            this.minMass = minMass;
            this.maxMass = maxMass;
        }

        public double getMinMass() {
            return minMass;
        }

        public void setMinMass(double minMass) {
            this.minMass = minMass;
        }

        public double getMaxMass() {
            return maxMass;
        }

        public void setMaxMass(double maxMass) {
            this.maxMass = maxMass;
        }

        public static void defineType(){
            System.out.println(carryCapacity.class.getClass());
        }
    }

    private carryCapacity carryCapacity;
    public FreightCar(String brand, String model, float engineVolume, carryCapacity carryCapacity) {
        super(brand, model, engineVolume);
        this.carryCapacity = carryCapacity;
    }

    public FreightCar.carryCapacity getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(FreightCar.carryCapacity carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    @Override
    public void startDriving() {
        System.out.println("Развивает скорость 100 км/ч за 15 секунд.");
    }

    @Override
    public void endDriving() {
        System.out.println("Останавливается за 15 секунд.");
    }
    @Override
    public void pitStop() {
        System.out.println("Дозаправляют, проверяю общее состояние автомобиля, исправляют замеченные неисправности, отправляют дальше");

    }

    @Override
    public void bestLapTime() {
        System.out.println("3.20 мин.");

    }

    @Override
    public void maxSpeed() {
        System.out.println("100 км/ч");

    }
}
