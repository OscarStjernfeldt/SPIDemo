import org.example.greet.Greeting;
import org.example.provide.EnglishGreeting;
import org.example.provide.FrenchGreeting;
import org.example.provide.SwedishGreeting;

module org.example.greetingprovider {
    requires org.example.greeting;
    provides Greeting with SwedishGreeting, EnglishGreeting, FrenchGreeting;
}