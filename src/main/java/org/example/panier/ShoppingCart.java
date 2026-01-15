package org.example.panier;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Client client;
    private List<CartItem> items;

    public ShoppingCart(Client client) {
        this.client = client;
        this.items = new ArrayList<>();
    }

//    ajouter un produit au panier
    public void addItem(ProductType productType, int quantity) {
        items.add(new CartItem(productType, quantity));
    }

//    calcul prix total du panier
    public double calculateTotal() {
        double total = 0.0;
        Pricing pricing = client.getPricing();
        for (CartItem item : items) {
            double pricePerUnit = pricing.calculatePrice(item.getProductType());
            total += pricePerUnit * item.getQuantity();
        }
        return total;
    }

//    print du detail du panier
    public void printCartDetails() {
        System.out.println(" Info du client: " + client.getClientInfo());
        System.out.println("produits:");
        Pricing pricing = client.getPricing();
        for (CartItem item : items) {
            double pricePerUnit = pricing.calculatePrice(item.getProductType());
            System.out.printf("- %s: %d x %.2f = %.2f%n",
                    item.getProductType(),
                    item.getQuantity(),
                    pricePerUnit,
                    pricePerUnit * item.getQuantity());
        }
        System.out.printf("Total : %.2f%n", calculateTotal());
    }

    public Client getClient() {
        return client;
    }

    public List<CartItem> getItems() {
        return new ArrayList<>(items);
    }
}
