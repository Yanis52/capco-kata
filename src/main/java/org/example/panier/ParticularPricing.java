package org.example.panier;

public class ParticularPricing implements Pricing {
//    prix pour un particulier
    @Override
    public double calculatePrice(ProductType productType) {
        switch (productType) {
            case HAUT_GAMME:
                return 1500.0;
            case MOYEN_GAMME:
                return 800.0;
            case LAPTOP:
                return 1200.0;
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
    }
}
