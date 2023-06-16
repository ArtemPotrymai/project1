package com.pizza;

import java.util.List;

public class Pizza {
    private String name;
    private String size;
    private List<String> toppings;

    public Pizza(String name, String size, List<String> toppings) {
        this.name = name;
        this.size = size;
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public List<String> getToppings() {
        return toppings;
    }
}
