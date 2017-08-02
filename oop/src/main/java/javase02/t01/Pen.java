package javase02.t01;

import java.util.Objects;

public class Pen {

    private String price;
    private String color;
    private String brand;
    private String countryOfManufacturing;

    private PenType penType;
    private InkType inkType;
    private Material material;


    public enum Material {
        METAL,
        PLASTIC,
        WOOD,
        COMPOSITE
    }

    public enum InkType {
        GEL,
        WATER,
        ALCOHOL,
        GLYCEROL
    }

    public enum PenType {
        CAPILLARY,
        BALLPOINT,
        GEL

    }

    public Pen(String price, String color, String brand, String countryOfManufacturing, PenType penType, InkType inkType, Material material) {
        this.price = price;
        this.color = color;
        this.brand = brand;
        this.countryOfManufacturing = countryOfManufacturing;
        this.penType = penType;
        this.inkType = inkType;
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (getClass() != obj.getClass()) return false;
        Pen pen = (Pen) obj;

        return     price != null ? price.equals(pen.price) : pen.price == null
                && color != null ? color.equals(pen.color) : pen.color == null
                && brand != null ? brand.equals(pen.brand) : pen.brand == null
                && countryOfManufacturing != null ? countryOfManufacturing.equals(pen.countryOfManufacturing) : pen.countryOfManufacturing == null
                && penType == pen.penType
                && inkType == pen.inkType
                && material == pen.material;
    }

    @Override
    public int hashCode() {
        int result = price != null ? price.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (countryOfManufacturing != null ? countryOfManufacturing.hashCode() : 0);
        result = 31 * result + (penType != null ? penType.hashCode() : 0);
        result = 31 * result + (inkType != null ? inkType.hashCode() : 0);
        result = 31 * result + (material != null ? material.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pen properties: " +
                "\nPrice is " + price +
                "\nColor is " + color +
                "\nBrand is " + brand +
                "\nCountry of manufacturing is " + countryOfManufacturing +
                "\nPen type is " + penType +
                "\nInk type is " + inkType +
                "\nMaterial is " + material;
    }
}