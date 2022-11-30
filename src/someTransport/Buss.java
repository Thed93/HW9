package someTransport;

public class Buss extends Transport implements Competing {

    public enum capacity {extraSmall(0,10), small(10,25),middle(25,50), large(50,80), extraLarge(80,120);
        private int minSeats;
        private int maxSeats;

        capacity(int minSeats, int maxSeats) {
            this.minSeats = minSeats;
            this.maxSeats = maxSeats;
        }

        public int getMinSeats() {
            return minSeats;
        }

        public void setMinSeats(int minSeats) {
            this.minSeats = minSeats;
        }

        public int getMaxSeats() {
            return maxSeats;
        }

        public void setMaxSeats(int maxSeats) {
            this.maxSeats = maxSeats;
        }
    }
    private capacity capacity;
    public Buss(String brand, String model, float engineVolume, capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Buss.capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Buss.capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void startDriving() {
        System.out.println("Развивает скорость 100 км/ч за 20 секунд.");
    }

    @Override
    public void endDriving() {
        System.out.println("Останавливается за 20 секунд.");
    }

    @Override
    public void pitStop() {
        System.out.println("Дозаправляют, проверяю исправность, состояние пассажиров, отправляют дальше");

    }

    @Override
    public void bestLapTime() {
        System.out.println("5.05 мин.");

    }

    @Override
    public void maxSpeed() {
        System.out.println("60 км/ч");

    }
}
