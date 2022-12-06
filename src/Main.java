public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Лада", "Гранта", 59.5599, "Бурый", BodyType.HATCHBACK, "автомат");
        System.out.println(lada);
        lada.printType();
        Bus anonim = new Bus(null, null, 0, "Чёрный", CapacityType.SMALL);
        System.out.println(anonim);
        anonim.printType();
        Truck gazel = new Truck("Газель", "ГАЗ-3302", 120, null);
        System.out.println(gazel);
        gazel.printType();

    }
}