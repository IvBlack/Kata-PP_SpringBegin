package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String myou;

    public Cat(String myou) {
        this.myou = myou;
    }
    @Override
    void say() {
        System.out.println(myou);
    }
    @Override
    public String toString() {
        return "Im a Cat";
    }


}