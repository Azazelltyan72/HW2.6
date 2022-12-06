public enum CapacityType {

    ESPECIALLY_SMALL(null, 10),
    SMALL(null, 25),
    MEDIUM(40, 50),
    BIG(60,80),
    ESPECIALLY_BIG(100,120);

    CapacityType(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }

    private final Integer from;
    private final Integer to;


    @Override
    public String toString() {
        if (this.to != null) {
            if (this.from != null) {
                return "Вместимость {" +
                        "от " + from + " мест до " + to + " мест" +
                        '}';
            }

        } else if (this.to == null) {
            return "Вместимость {" +
                    "от " + from + " мест" +
                    '}';
        }
        return "Вместимость {" +
                "до " + to + " мест" +
                '}';
    }
}