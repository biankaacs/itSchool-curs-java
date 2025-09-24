package org.example.session34;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    private String blat;
    private String sos;
    private String topping;
    private List<String> toppings;

    public static class PizzaBuilder{
        private Pizza pizza;
        public PizzaBuilder() {
            pizza = new Pizza();
            pizza.toppings = new ArrayList<>();
        }

        public PizzaBuilder blat(String blat) {
            pizza.blat = blat;
            return this;
        }

        public PizzaBuilder sos(String sos) {
            pizza.sos = sos;
            return this;
        }

        public PizzaBuilder addToppings(String toppings){
            pizza.toppings.add(toppings);
            return this;
        }

        public Pizza build() {
            return pizza;
        }

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "blat='" + blat + '\'' +
                ", sos='" + sos + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}

class PizzaB {
    private String blat;
    private String sos;
    private List<String> toppings;

public PizzaB withBlat(String blat) {
        this.blat = blat;
        return this;
    }
    public PizzaB withSos(String sos) {
        this.sos = sos;
        return this;
    }
    public PizzaB withTopping(String topping) {
        if (this.toppings == null) toppings = new ArrayList<>(); toppings.add(topping);
        return this;
    }

    @Override
    public String toString() {
        return "PizzaBuilderExample{" +
                "blat='" + blat + '\'' +
                ", sos='" + sos + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}

public class Builder {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .blat("subtire")
                .sos("rosii")
                .addToppings("ciuperci")
                .addToppings("mozarrella")
                .addToppings("pui")
                .addToppings("ardei")
                .build();
        System.out.println(pizza.toString());

        PizzaB pizzab = new PizzaB()
                .withBlat("pufos")
                .withSos("rosii")
                .withTopping("pui")
                .withTopping("ananas")
                .withTopping("para")
                .withTopping("porumb");
        System.out.println(pizzab.toString());
    }
}
