package org.example.panier;

public class ParticularClient extends Client {
    private String firstName;
    private String lastName;

    public ParticularClient(int clientId, String firstName, String lastName) {
        super(clientId, new ParticularPricing());
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String getClientInfo() {
        return "    Client ID: " + clientId + "\n" +
               "    Name: " + firstName + " " + lastName + "\n" +
               "    Pricing Type: Particular Pricing";
    }
}
