package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String saing;


    public Dog(String saing) {
        this.saing = saing;
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }
}
