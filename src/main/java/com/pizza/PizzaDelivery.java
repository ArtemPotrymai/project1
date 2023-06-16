package com.pizza;

public class PizzaDelivery {
    private String deliveryAddress;
    private Pizza pizza;
    private String deliveryStatus;

    public PizzaDelivery(String deliveryAddress, Pizza pizza) {
        this.deliveryAddress = deliveryAddress;
        this.pizza = pizza;
        this.deliveryStatus = "W trakcie";
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
