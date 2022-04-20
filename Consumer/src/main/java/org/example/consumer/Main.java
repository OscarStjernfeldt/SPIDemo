package org.example.consumer;

import org.example.greet.Greeting;


import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {

        ServiceLoader<Greeting> serviceLoader = ServiceLoader.load(Greeting.class);

        serviceLoader.stream().forEach(s -> System.out.println(s.get().greet()));
    }
}
