package org.example.panier;

import java.util.Optional;

public class ProfessionalClient extends Client {
    private String companyName;
    private Optional<String> TvaNumber;
    private String sirenNumber;
    private double ca;

//constructor
    public ProfessionalClient(int clientId, String companyName, Optional<String> TvaNumber, String sirenNumber, double ca) {
        super(clientId,ProfessionalPricing(ca));
        this.companyName = companyName;
        this.TvaNumber = TvaNumber;
        this.sirenNumber = sirenNumber;
        this.ca = ca;
    }

    private static Pricing ProfessionalPricing(double ca) {
        if (ca > 10_000_000) {
            return new ProfessionalHighRevenuePricing();
        } else {
            return new ProfessionalLowRevenuePricing();
        }
    }
//     getter methods
    public String getCompanyName() {
        return companyName;
    }
    public Optional<String> getTvaNumber() {
        return TvaNumber;
    }
    public String getSirenNumber() {
        return sirenNumber;
    }
    public double getCa() {
        return ca;
    }




    @Override
    public String getClientInfo() {
        return " Professional Client ID: " +  clientId + "\n" +
               " Pricing Type: Professional Pricing"+ "\n"+
        " Company Name: " + companyName + "\n" +
               " TVA Number: " + TvaNumber.orElse("N/A") + "\n" +
               " SIREN Number: " + sirenNumber + "\n" +
               " Annual Revenue: " + ca + " EUR\n";
    }
}
