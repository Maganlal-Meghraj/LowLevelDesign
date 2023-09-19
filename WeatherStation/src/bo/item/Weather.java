package bo.item;

public class Weather implements Item{
    private int temp;
    private Unit unit;

    private Weather(Weather weather) {
        this.temp = weather.temp;
        this.unit = weather.unit;
    }
    @Override
    public Item clone() {
        return new Weather(this);
    }
}
