package org.example.panier;

import java.util.Optional;

public class Main {

//    test de l'application
    public static void main(String[] args) {
        System.out.println("demo");
        System.out.println("=====================================");
        System.out.println("client particulier:");
        testParticularClient();
        System.out.println("=====================================");
        System.out.println("client professionnel <10M de CA:");
        testProfessionalLowRevenueClient();
        System.out.println("=====================================");
        System.out.println("client professionnel >10M de CA:");
        testProfessionalHighRevenueClient();

    }
        private static void testParticularClient() {
//        client particulier
            ParticularClient particularClient = new ParticularClient(1, "yanis", "habarek");
            System.out.println(particularClient.getClientInfo());
//        creation de son panier
            ShoppingCart particularCart = new ShoppingCart(particularClient);
            particularCart.addItem(ProductType.HAUT_GAMME, 2);
            particularCart.addItem(ProductType.LAPTOP, 1);
            particularCart.addItem(ProductType.MOYEN_GAMME, 3);
            System.out.println("Résultats pour le client particulier: ");
            particularCart.printCartDetails();

        }
//        test sur un pro <10M
        private static void testProfessionalLowRevenueClient() {
            ProfessionalClient proLowRevClient = new ProfessionalClient(2, "capco", Optional.of("48HF3898HX"),"154895645",9_000_000.0);
            System.out.println(proLowRevClient.getClientInfo());
            ShoppingCart proLowRevCart = new ShoppingCart(proLowRevClient);
            proLowRevCart.addItem(ProductType.HAUT_GAMME, 1);
            proLowRevCart.addItem(ProductType.LAPTOP, 2);
            proLowRevCart.addItem(ProductType.MOYEN_GAMME, 4);
            System.out.println("Résultats pour le client professionnel à <10M de CA: ");
            proLowRevCart.printCartDetails();

        }
//        test sur un pro >10M
        private static void testProfessionalHighRevenueClient() {
            ProfessionalClient proHighRevClient = new ProfessionalClient(3, "ibm", Optional.empty(),"154895645",15_000_000.0);
            System.out.println(proHighRevClient.getClientInfo());
            ShoppingCart proHighRevCart = new ShoppingCart(proHighRevClient);
            proHighRevCart.addItem(ProductType.HAUT_GAMME, 3);
            proHighRevCart.addItem(ProductType.LAPTOP, 1);
            proHighRevCart.addItem(ProductType.MOYEN_GAMME, 2);
            System.out.println("Résultats pour le client professionnel à >10M de CA: ");
            proHighRevCart.printCartDetails();
        }
    }

