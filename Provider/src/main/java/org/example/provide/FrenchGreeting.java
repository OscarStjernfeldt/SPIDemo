package org.example.provide;

import org.example.greet.Greeting;

public class FrenchGreeting implements Greeting {
    @Override
    public String greet() {
        return "Bonjour!";
    }
}
