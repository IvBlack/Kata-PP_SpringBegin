package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String woof;


    public Dog(String woof) {
        this.woof = woof;
    }
    @Override
    void say() {
        System.out.println(woof);
    }
    @Override
    public String toString() {
        return "I'm a Dog";
    }
}
