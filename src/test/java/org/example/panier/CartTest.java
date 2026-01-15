package org.example.panier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    @Test
    public void testParticularClientPricing() {
        ParticularClient client = new ParticularClient(1, "yanis", "hab");
        ShoppingCart cart = new ShoppingCart(client);

        cart.addItem(ProductType.HAUT_GAMME, 1);

        assertEquals(1500.0, cart.calculateTotal(), 0.01);
    }
}
