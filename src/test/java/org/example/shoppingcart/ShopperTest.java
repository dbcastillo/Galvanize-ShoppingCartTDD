package org.example.shoppingcart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopperTest {

    @Test
    public void testNewShopperThenCartIsEmpty() {
        // Arrange
        Shopper testShopper = new Shopper();

        // Act
        ShoppingCart testShopperShoppingCart = testShopper.getShoppingCart();

        // Assert
        assertTrue(testShopperShoppingCart.isEmpty());
    }

}
