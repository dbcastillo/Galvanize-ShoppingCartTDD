package org.example.shoppingcart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


// Assumption - Everytime I come to the site, after previous logoff, I am treated as a new shopper.
//  Shopper1 -> Shopper1.ShoppingCart
//  Shopper2 -> Shopper2.ShoppingCart

public class ShoppingCartTest {

    @Test
    public void testAddItemInEmptyCartThenGetSubtotalAsPriceOfItem() {
        //Arrange
        ShoppingCart testShoppingCart = new ShoppingCart();
        Item testItem = new Item("apple", 5.40);

        //Act
        testShoppingCart.addItem(testItem);

        //Assert
        assertEquals(testShoppingCart.getSubtotal(), 5.40, 5.40 / 1000000000.0);
    }

    @Test
    public void testAddItemInFullCartThenGetSubtotalAsPriceOfAllItems() {
        //Arrange
        ShoppingCart testShoppingCart = new ShoppingCart();
        Item testItem1 = new Item("apple", 5.40);
        Item testItem2 = new Item("toothpaste", 7.60);
        Item testItem3 = new Item("gum", 2.00);
        testShoppingCart.addItem(testItem1);
        testShoppingCart.addItem(testItem2);
        testShoppingCart.addItem(testItem3);
        //Act
        testShoppingCart.addItem(new Item("soap", 5.00));

        //Assert
        assertEquals(testShoppingCart.getSubtotal(), 20.00, 20.00 / 1000000000.0);
    }

    @Test
    public void testIfNewShoppingCartThenIsEmpty() {
        //Arrange
        ShoppingCart testShoppingCart = new ShoppingCart();

        //Act

        //Assert
        assertTrue(testShoppingCart.isEmpty());
    }


    // Map is Key, Value (Milk, 5)
    // When you add an item, first check if that item exist in Map? If yes, get existing qty & +1.
    // subtotal will be Key (Milk).getPrice() * Value (Qty)

    @Test
    public void testAddExistingItemThenUpdateQuantity() {
        //Arrange
        ShoppingCart testShoppingCart = new ShoppingCart();
        Item testItem1 = new Item("apple", 5.40);
        testShoppingCart.addItem(testItem1);

        //Act
        testShoppingCart.addItem(testItem1);

        //Assert
        assertEquals(testShoppingCart.getQuantity(testItem1), 2);
    }
}
