package org.example.shoppingcart;

import java.util.*;

public class ShoppingCart {
    private boolean empty = true;
 //   private List<Item> listOfItems = new ArrayList<>();

    // Map<Item, Quantity>
    private Map<Item, Integer> mapOfItems = new HashMap<>();

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
