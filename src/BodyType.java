public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    BodyType(String nameInRussian) {
        this.nameInRussian = nameInRussian;
    }

    private final String nameInRussian;


    @Override
    public String toString() {
        return "Тип кузова {" +
                "Название типа кузова на русском языке '" + nameInRussian + '\'' +
                '}';
    }
}