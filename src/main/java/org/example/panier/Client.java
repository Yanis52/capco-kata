package org.example.panier;

public abstract class Client {
    protected int clientId;
    protected Pricing pricing;

    public Client(int clientId, Pricing pricing) {
        this.clientId = clientId;
        this.pricing = pricing;
    }

    public int getClientId() {
        return clientId;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public abstract String getClientInfo();
}
