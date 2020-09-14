package ru.mirea;

import ru.mirea.Furniture.Armchair;
import ru.mirea.Furniture.Furniture;
import ru.mirea.Furniture.Sofa;
import ru.mirea.Furniture.Table;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FurnitureShop Putur=new FurnitureShop();

        Furniture b=new Armchair("simple",100,"red",3000);
        Putur.addWarehouse(b, new Table("oak",100,50,"brown",5000), new Sofa("cotton","white",8000));
        Putur.showAssortment();

        Putur.sell(b);
        Putur.showAssortment();


        Putur.sell(1);
        Putur.showAssortment();

        Putur.addWarehouse(new Armchair("just", 100, "yellow",800), new Table("pokrod",100,50,"blue",4500), new Sofa("chlopok","black",6000));
        Putur.showAssortment();
    }
}
