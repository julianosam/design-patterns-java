package app.domain;


import org.springframework.stereotype.Component;

@Component
public class Greeter {

    public String getGreeting() {
        return "Spring!";
    }
}