package org.example.consumer;

import org.example.greet.Greeting;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {

        ServiceLoader<Greeting> serviceLoader = ServiceLoader.load(Greeting.class);

        System.out.println("Swedish only:");
        serviceLoader.stream().map(ServiceLoader.Provider::get)
                .filter(greetingProvider -> greetingProvider.getClass().getSimpleName().startsWith("Swedish")).forEach(greetingProvider -> System.out.println(greetingProvider.greet()));

        System.out.println("----------------");
        System.out.println("All languages:");
        serviceLoader.stream().forEach(s -> System.out.println(s.get().greet()));
    }
}
