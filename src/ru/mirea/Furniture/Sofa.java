package ru.mirea.Furniture;

public class Sofa extends Furniture {
    private String cloth;


    public Sofa(String cloth, String color, int price) {
        super(price,color);
        this.cloth = cloth;

    }

    @Override
    public String toString() {
        return "Sofa{" +
                "cloth='" + cloth + '\'' +
                ", color='" + color + '\'' +
                ", price="
                +price+"}";
    }
}
