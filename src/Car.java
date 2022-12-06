public class Car extends MotorTransport implements Competing {
    private String color;
    private final String transmission;
    private BodyType bodyType;

    @Override
    public void startMoving() {
        System.out.println(color + " легковой автомобиль с коробкой передач типа " + transmission + " начинает движение.");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyType());
        }
    }

    @Override
    public void finishMoving() {
        System.out.println(color + " легковой автомобиль с коробкой передач типа " + transmission + " заканчивает движение.");
    }

    public Car(String brand, String model, double engineCapacity, String color, BodyType bodyType, String transmission) {
        super(brand, model, engineCapacity);
        setColor(color);
//        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            setBodyType(bodyType);
//        } else {
//            this.bodyType = "Пикап";
//        }
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "полуавтомат";
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "Красный";
        } else {
            this.color = color;
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public String getTransmission() {
        return transmission;
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", color ='" + color + '\'' +
                ", bodyType ='" + bodyType + '\'' +
                ", transmission ='" + transmission + '\'' +
                ", engineCapacity ='" + String.format("%.2f", getEngineCapacity()) +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.println(("Автомобиль " + this.getBrand() + " " +  this.getModel() + " делает пит-стоп (техническую оставку)."));
    }

    @Override
    public void maxSpeed() {
        System.out.println(("Автомобиль " + this.getBrand() + " " +  this.getModel() + " достигает максимальной скорости."));
    }

    @Override
    public void bestTime() {
        System.out.println(("У автомобиля " + this.getBrand() + " " +  this.getModel() + " лучшее время."));
    }
}
