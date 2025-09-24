package org.example.session34;

import java.util.ArrayList;
import java.util.List;

interface ObserverInt{
    void update(String message);
}

class NewSubscriber implements ObserverInt{
    private String name;

    public NewSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class NewsAgency {
    private List<ObserverInt> observers = new ArrayList<>();

    public void addObserver(ObserverInt o) {
        observers.add(o);
    }
    public void publishNews(String message) {
        for (ObserverInt o : observers) o.update(message);
    }
}

public class Observer {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewSubscriber s1 = new NewSubscriber("Marcel");
        NewSubscriber s2 = new NewSubscriber("Marcela");
        agency.addObserver(s1);
        agency.addObserver(s2);
        agency.publishNews("Breaking News: Observer Pattern in Action!");
    }
}
