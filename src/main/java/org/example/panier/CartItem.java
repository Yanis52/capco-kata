package org.example.panier;
//articles  dans le panier
public class CartItem {
    private ProductType productType;
    private int quantity;

    public CartItem(ProductType productType, int quantity) {
        if(quantity <= 0) {
            throw new IllegalArgumentException("la qtt doit ettre >0");
        }
        this.productType = productType;
        this.quantity = quantity;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }
}
