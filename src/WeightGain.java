public enum WeightGain {
    N1(null, 3.5),
    N2(3.5, 12D),
    N3(12D, null);

    WeightGain(Double from, Double to) {
        this.from = from;
        this.to = to;
    }

    private final Double from;
    private final Double to;


    @Override
    public String toString() {
        if (this.to != null) {
            if (this.from != null) {
                return "Грузоподъемность {" +
                        "от " + from + " тонн до " + to + " тонн" +
                        '}';
            }

        } else if (this.to == null) {
            return "Грузоподъемность {" +
                    "от " + from + " тонн" +
                    '}';
        }
        return "Грузоподъемность {" +
                "до " + to + " тонн" +
                '}';
    }

}
