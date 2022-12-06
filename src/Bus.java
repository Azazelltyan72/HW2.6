public class Bus extends MotorTransport implements Competing {
    private String color;
    private CapacityType capacityType;
    @Override
    public void startMoving() {
        System.out.println(color + " автобус начинает движение.");
    }

    @Override
    public void printType() {
        if (capacityType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getCapacityType());
        }
    }
    @Override
    public void finishMoving() {
        System.out.println(color + " автобус заканчивает движение.");
    }

    public Bus(String brand, String model, double engineCapacity, String color, CapacityType capacityType) {
        super(brand, model, engineCapacity);
        setCapacityType(capacityType);
        setColor(color);
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color ==
 null || color.isEmpty() || color.isBlank()) {
            this.color = "Красный";
        } else {
            this.color = color;
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", color ='" + color + '\'' +
                ", engineCapacity ='" + String.format("%.2f", getEngineCapacity()) +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.println(("Автобус " + this.getBrand() + " " +  this.getModel() + " делает пит-стоп (техническую оставку)."));
    }

    @Override
    public void maxSpeed() {
        System.out.println(("Автобус " + this.getBrand() + " " +  this.getModel() + " достигает максимальной скорости."));
    }

    @Override
    public void bestTime() {
        System.out.println(("У автобуса " + this.getBrand() + " " +  this.getModel() + " лучшее время."));
    }


}
