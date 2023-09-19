package bo.item;

public enum Unit {
    Celsius("C"),
    Fahrenheit ("F"),
    Kelvin("K");
    private final String symbol;

    Unit(String name) {
        this.symbol =name;
    }

    public String getSymbol() {
        return symbol;
    }
}
