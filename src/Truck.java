public class Truck extends MotorTransport implements Competing{
    public Truck(String brand, String model, double engineCapacity, WeightGain weightGain) {
        super(brand, model, engineCapacity);
        setWeightGain(weightGain);
    }
    private WeightGain weightGain;

    @Override
    public void startMoving() {
        System.out.println("Грузовик начинает движение.");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик заканчивает движение.");
    }
    public WeightGain weightGain() {
        return weightGain;
    }

    public void setWeightGain(WeightGain weightGain) {
        this.weightGain = weightGain;
    }
    @Override
    public String toString() {
        return "Truk{" +
                "brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", engineCapacity ='" + String.format("%.2f", getEngineCapacity()) +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.println(("Грузовик " + this.getBrand() + " " +  this.getModel() + " делает пит-стоп (техническую оставку)."));
    }

    @Override
    public void maxSpeed() {
        System.out.println(("Грузовик " + this.getBrand() + " " +  this.getModel() + " достигает максимальной скорости."));
    }

    @Override
    public void bestTime() {
        System.out.println(("У грузовика " + this.getBrand() + " " +  this.getModel() + " лучшее время."));
    }
}
