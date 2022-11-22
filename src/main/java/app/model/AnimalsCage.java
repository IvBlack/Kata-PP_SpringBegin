package app.model;

import app.model.Animal;
import app.model.Timer;
//import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer t;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        animal.say();
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println(t.getTime());
        System.out.println("________________________");
    }
}
