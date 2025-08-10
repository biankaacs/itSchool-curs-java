package org.example.session18.homework;

import java.util.HashMap;
import java.util.Map;

public class Objects {
    //Given a list of objects representing database entities with fields such as id, name, and timestamp, ensure that no two entities are considered equal if their id fields are different.
    private int id;
    private String name;
    private long timestamp;


    //Simulate a cache where objects are stored. Objects with the same hashcode should overwrite existing objects in the cache. Consider how would you design the hashcode method to facilitate this.
    @Override
    public int hashCode() {
        return id; // Assuming id is unique for each object
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Objects objects = (Objects) obj;
        return id == objects.id; // Equality based on id
    }

    //Create a method that returns a JSON representation of an object. The method should make use of the toString method to facilitate this.
    public String toJson() {
        return "{" +
                "\"id\":" + id + "," +
                "\"name\":\"" + name + "\"," +
                "\"timestamp\":" + timestamp +
                "}";
    }
    @Override
    public String toString() {
        return "Objects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
    //Implement the toString method in a class holding a large dataset to print a “summary” version of the dataset, facilitating debugging and logging.
    public String toSummaryString() {
        return "Objects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}'; // Summary version without timestamp
    }

    //Create a generic method to swap the positions of two elements in an array.
    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid indices for swap");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    //Create a class Pair which can hold a pair of objects, the objects can be of any type.
    public static class Pair<T, U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }

    //Create a day scheduler application that uses an enum to represent the days of the week.
    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public String getActivities() {
            switch (this) {
                case MONDAY:
                    return "Gym";
                case TUESDAY:
                    return "Yoga";
                case WEDNESDAY:
                    return "Swimming";
                case THURSDAY:
                    return "Running";
                case FRIDAY:
                    return "Cycling";
                case SATURDAY:
                    return "Hiking";
                case SUNDAY:
                    return "Rest";
                default:
                    return "No activities scheduled";
            }
        }
    }
    // The application should be able to assign and retrieve activities for each day.
    public static void main(String[] args) {
        // Example usage of the Pair class
        Pair<String, Integer> pair = new Pair<>("Apple", 5);
        System.out.println(pair);

        // Example usage of the DayOfWeek enum
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day + ": " + day.getActivities());
        }

        // Example usage of the swap method
        String[] array = {"A", "B", "C", "D"};
        swap(array, 1, 3);
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
    //Create a simulation of a traffic light system using an enum to represent the different states of a traffic light.
    public enum TrafficLight {
        RED(30), // 30 seconds for red
        YELLOW(5), // 5 seconds for yellow
        GREEN(25); // 25 seconds for green

        private final int duration;

        TrafficLight(int duration) {
            this.duration = duration;
        }

        public int getDuration() {
            return duration;
        }

        @Override
        public String toString() {
            return this.name() + " light lasts for " + duration + " seconds.";
        }
    }
    //Create a generic repository class for storing objects. The repository should use a HashMap internally. Override equals and hashcode methods to ensure the correct behavior of the repository.
    public static class GenericRepository<T> {
        private final Map<Integer, T> repository = new HashMap<>();

        public void add(T object) {
            if (object == null) {
                throw new IllegalArgumentException("Cannot add null object");
            }
            int hashCode = object.hashCode();
            repository.put(hashCode, object);
        }

        public T get(int id) {
            return repository.get(id);
        }

        public void remove(int id) {
            repository.remove(id);
        }

        @Override
        public String toString() {
            return "GenericRepository{" +
                    "repository=" + repository +
                    '}';
        }
    }
    //Extend an enum representing car types to include properties such as average price and manufacturer. Override the toString method to provide a descriptive string representing each enum constant.
    public enum CarType {
        SEDAN("Sedan", 20000, "Toyota"),
        SUV("SUV", 30000, "Ford"),
        TRUCK("Truck", 40000, "Chevrolet");

        private final String name;
        private final int averagePrice;
        private final String manufacturer;

        CarType(String name, int averagePrice, String manufacturer) {
            this.name = name;
            this.averagePrice = averagePrice;
            this.manufacturer = manufacturer;
        }

        @Override
        public String toString() {
            return name + " (Average Price: $" + averagePrice + ", Manufacturer: " + manufacturer + ")";
        }
    }



}
