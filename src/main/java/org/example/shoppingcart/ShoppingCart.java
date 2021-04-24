package org.example.shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    // Map<Item, Quantity>
    private final Map<Item, Integer> mapOfItems = new HashMap<>();
    //   private List<Item> listOfItems = new ArrayList<>();
    private boolean empty = true;

    public boolean isEmpty() {
        return empty;
    }

    public void addItem(final Item item) {
        //      listOfItems.add(item);
        int quantity = 0;
        if (mapOfItems.containsKey(item)) {
            quantity = mapOfItems.get(item) + 1;
        } else {
            quantity = 1;
        }
        mapOfItems.put(item, quantity);
        empty = false;
    }

    public double getSubtotal() {
        double subtotal = 0;

        for (Item item : mapOfItems.keySet()) {
            double quantity = mapOfItems.get(item);
            subtotal += (item.getPrice() * quantity);
        }

//        for (Item i: listOfItems) {
//            subtotal += i.getPrice();
//        }

        return subtotal;
    }

    public int getQuantity(Item item) {
        return mapOfItems.get(item);
    }
}
