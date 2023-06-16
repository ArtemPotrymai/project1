package com.pizza;

import util.PizzaUtils;

import java.util.List;


public class PizzaApp {
    public static void main(String[] args) {
        // Tworzenie pizzy
        Pizza pizza = new Pizza("Pepperoni", "Large", List.of("Pepperoni", "Ser"));

        // Tworzenie dostawy pizzy
        PizzaDelivery delivery = new PizzaDelivery("Radzymińska 119, 03-549 Warszawa", pizza);

        // Aktualizacja statusu dostawy
        delivery.setDeliveryStatus("Dostarczony");

        // Wyświetlanie informacji o dostawie
        System.out.println("Dostawa pizzy:");
        System.out.println("Adres: " + delivery.getDeliveryAddress());
        System.out.println("Pizza: " + delivery.getPizza().getName());
        System.out.println("Status: " + delivery.getDeliveryStatus());

        // Wyświetlanie dostępnych rozmiarów pizzy za pomocą klasy PizzaUtils
        List<String> availableSizes = PizzaUtils.getAvailableSizes();
        System.out.println("Dostępne rozmiary pizzy: " + availableSizes);
    }
}
