public abstract class MotorTransport {
    private final String brand;
    private final String model;
    private double engineCapacity;

    public abstract void startMoving();
    public abstract void printType();
    public abstract void finishMoving();

    public MotorTransport(String brand, String model, double engineCapacity) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        setEngineCapacity(engineCapacity);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity > 0) {
            this.engineCapacity = engineCapacity;
        } else {
            this.engineCapacity = 60;
        }
    }
}
