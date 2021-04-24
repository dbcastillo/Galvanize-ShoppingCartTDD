package org.example.shoppingcart;

public class Shopper {
    private final ShoppingCart shoppingCart;

    public Shopper() {
        this.shoppingCart = new ShoppingCart();
    }

    public ShoppingCart getShoppingCart() {
        return this.shoppingCart;
    }
}
