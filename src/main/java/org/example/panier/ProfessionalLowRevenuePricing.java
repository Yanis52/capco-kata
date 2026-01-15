package org.example.panier;

public class ProfessionalLowRevenuePricing implements Pricing{
//prix pour les pro a bas revenus
    @Override
    public double calculatePrice(ProductType productType) {
        switch (productType) {
            case HAUT_GAMME:
                return 1150.0;
            case MOYEN_GAMME:
                return 600.0;
            case LAPTOP:
                return 1000.0;
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
    }
}
