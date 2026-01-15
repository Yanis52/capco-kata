package org.example.panier;

import java.security.Principal;

public class ProfessionalHighRevenuePricing  implements Pricing {
//    prix pour les clients professionnels à haut revenus
    @Override
    public double calculatePrice(ProductType productType) {
        switch (productType) {
            case HAUT_GAMME:
                return 1000.0;
            case MOYEN_GAMME:
                return 550.0;
            case LAPTOP:
                return 900.0;
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
    }
    }

