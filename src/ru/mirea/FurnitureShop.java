package ru.mirea;

import ru.mirea.Furniture.Furniture;

import java.io.IOException;
import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> warehouse;
    private int quantity;

    public FurnitureShop() {
        this.warehouse = new ArrayList<>();
        quantity=0;
    }

    public void sell(Furniture a){
        if (warehouse.contains(a)){
        System.out.println("\n->Продаём: " + a + "\n за " +a.getPrice());
        warehouse.remove(a);
        System.out.println("===Успешно!===");
        }
        else{
            System.out.println("\n->Товар отсутствует на складе");
        }

    }public void sell(int id){
        id-=1;
        if(warehouse.size()>id){
        System.out.println("\n->Продаём: " + warehouse.get(id) + "\n за " +warehouse.get(id).getPrice());
        warehouse.remove(id);
        System.out.println("===Успешно!===");
        }
        else{
            System.out.println("\n->Товар отсутствует на складе");
        }

    }

    public void addWarehouse(Furniture...a){
        for (Furniture obj:a
             ) {
            warehouse.add(obj);
            quantity++;
        }
    }

    void showAssortment(){
        System.out.println("\n->В магазине имеется:");
        for(int i=0; i<warehouse.size(); i++)
            System.out.println(i+1 +". " + (warehouse.get(i)));
    }

}
