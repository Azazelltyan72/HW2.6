public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Лада", "Гранта", 59.5599, "Бурый", BodyType.HATCHBACK, "автомат");
        System.out.println(lada.getBodyType());
        Bus anonim = new Bus(null, null, 0, "Чёрный", CapacityType.SMALL);
        System.out.println(anonim.getCapacityType());
        Truck gazel = new Truck("Газель", "ГАЗ-3302", 120, WeightGain.N3);
        System.out.println(gazel.weightGain());

    }
}