package ru.mirea.Furniture;

public abstract class Furniture {
    protected String color;
    protected int price;
    protected int id;
    Furniture(int price, String color){
        this.id=id;
        this.price=price;
        this.color=color;
    }


    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
