package org.example.shoppingcart;

import java.util.Objects;

public class Item {

    private String name;
    private double price;

    public Item(final String name,
                final double price){
        this.price = price;
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 && name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
