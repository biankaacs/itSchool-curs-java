package org.example.session19;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.*;
import java.util.stream.Collectors;

public class CoffeeShopApp {
    public static void main(String[] args) {
        GreetingService greeting = (name) -> System.out.println("Welcome to the Coffee Shop, " + name + "!");
        greeting.greet("Marcel");

        Supplier<String> idGenerator = () -> "UUID" + UUID.randomUUID().toString().substring(0, 8);

        Function<String,Order> createOrder = (drink) -> new Order(idGenerator.get(), drink);

        List<Order> orders = Arrays.asList(
            createOrder.apply("Latte cu migdale"),
            createOrder.apply("Cappuccino"),
            createOrder.apply("Espresso"),
            createOrder.apply("Latte cu soia")
        );

        System.out.println("Coffee Shop Orders:");
        Consumer<Order> printOrder = order -> System.out.println(order);
        orders.forEach(printOrder);

        Predicate<Order> isPlantBased = order -> order.getDrink().toLowerCase().contains("soia") || order.getDrink().toLowerCase().contains("migdale");
        List<Order> veganOrders = orders.stream()
            .filter(isPlantBased)
            .collect(Collectors.toList());
        System.out.println("\nPlant-Based Orders:");
        veganOrders.forEach(printOrder);

        Map<String, Double> priceList = Map.of(
            "Latte cu migdale", 15.0,
            "Cappuccino", 12.0,
            "Espresso", 10.0,
            "Latte cu soia", 14.0
        );

        BinaryOperator<Double> totalCalc = Double::sum;
        double totalPrice = orders.stream()
                .map(order -> priceList.getOrDefault(order.getDrink(), 0.0))
                .reduce(0.0, totalCalc);
        System.out.println(totalPrice);

    }

}
@FunctionalInterface
interface GreetingService {
    void greet(String name);
}
class Order{
    private String id;
    private String drink;

   public Order (){
   }

    public Order(String id, String drink) {
        this.id = id;
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }
}
