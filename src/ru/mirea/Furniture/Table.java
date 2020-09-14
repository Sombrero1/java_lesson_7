package ru.mirea.Furniture;

public class Table extends Furniture {
    private String wood;
    private int lenght;
    private int width;

    public Table(String wood, int lenght, int width, String color, int price) {
        super(price,color);
        this.wood = wood;
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Table{" +
                "wood='" + wood + '\'' +
                ", lenght=" + lenght +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", price="
                +price+"}";
    }
}
