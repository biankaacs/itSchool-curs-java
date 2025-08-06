package org.example.session20;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PizzaOrderSystem {
    public static void main(String[] args) {
        List<PizzaOrder> orders = List.of(
            new PizzaOrder("Margherita", List.of("branza"), 30),
            new PizzaOrder("Pepperoni", List.of("carne", "branza"), 40),
            new PizzaOrder("Vegetarian", List.of("ciuperci", "ardei", "maslina"), 50),
            new PizzaOrder("Hawaiian", List.of("ananas"), 50)
        );
        System.out.println(orders);

        //filter and forEach example
        orders.stream()
            .filter(o -> o.getPrice() > 30)
                .forEach(o -> System.out.println("Pizza with price > 30: " + o.getName()));
        List<String> messages = orders.stream()
            .map(o -> "Pizza " + o.getName() + " costs " + o.getPrice() + " and has toppings: "
                    + String.join(", ", o.getToppings()))
                .filter(o -> o.contains("Margherita"))
                .collect(Collectors.toList());
        messages.forEach(System.out::println);

        orders.stream()
                .map(PizzaOrder::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        orders.stream()
                .flatMap(o -> o.getToppings().stream())
                .distinct()
                .forEach(System.out::println);
        int total = orders.stream()
                .map(PizzaOrder::getPrice)//o->getPrice()
                .reduce(0, Integer::sum); //.reduce(0, (a, b) -> a + b)
        System.out.println("Total price"+ total);

        long nrOfOrders = orders.stream()
                .filter(o-> o.getToppings().contains("carne"))
                .count();
        System.out.println("Number of orders with carne topping: " + nrOfOrders);

        boolean hasVegan = orders.stream().anyMatch(o-> !o.getToppings().contains("carne"));
        System.out.println("Has vegan pizza: " + hasVegan);

        orders.stream()
                .map(PizzaOrder::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Optional<PizzaOrder> optionalPizzaOrder = orders.stream()
                .filter(o-> o.getPrice()>45)
                .findFirst();
        System.out.println("Optional: " + optionalPizzaOrder);

        Map<String, List<PizzaOrder>> groupByName = orders.stream()
                .collect(Collectors.groupingBy(PizzaOrder::getName));
        groupByName.forEach((name, list) -> System.out.println(name+"->"+list.size()+" orders"));
        System.out.println(groupByName);

    }
}
class PizzaOrder {
    private String name;
    private List<String> toppings;
    private int price;

    public PizzaOrder(String name, List<String> toppings, int price) {
        this.name = name;
        this.toppings = toppings;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public List<String> getToppings() {
        return toppings;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings +
                ", price=" + price +
                '}';
    }

}
