package org.example.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private boolean empty = true;
    private List<Item> listOfItems = new ArrayList<>();

    public boolean isEmpty() {
        return empty;
    }

    public void addItem(Item item) {
        listOfItems.add(item);
        empty = false;
    }

    public double getSubtotal() {
        double subtotal = 0;

        for (Item i: listOfItems) {
            subtotal += i.getPrice();
        }
        return subtotal;
    }
}
