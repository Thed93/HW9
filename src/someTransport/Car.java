package someTransport;

public class Car extends Transport implements Competing {

    public enum body {sedan, heckBack, coupe, universal, SUV, crossover, pickup, van, minivan;
        body() {
        }
    }
    private body carBody;
    public Car(String brand, String model, float engineVolume, body carBody) {
        super(brand, model, engineVolume);
        this.carBody = carBody;
    }

    public body getCarBody() {
        return carBody;
    }

    public void setCarBody(body carBody) {
        this.carBody = carBody;
    }

    @Override
    public void startDriving() {
        System.out.println("Развивает скорость 100 км/ч за 7 секунд.");
    }

    @Override
    public void endDriving() {
        System.out.println("Останавливается за 10 секунд.");
    }

    @Override
    public void pitStop() {
        System.out.println("меняют шины на колеса, дозаправляют");
    }

    @Override
    public void bestLapTime() {
        System.out.println("2.00 мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("140 км/ч");
    }
}
