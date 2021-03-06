package javase02.t02.Chancery;

public class Notepad implements ChanceryItem {

    private final String name;
    private final double price;

    Notepad(String name, double price) {
        assert price > 0 && name.length() > 0;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
