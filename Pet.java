import java.util.ArrayList;
import java.util.Random;

public class Pet {
    public static void main(String[] args) {
        Random random = new Random();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal[] animals = new Animal[10];
        for (int i = 0; i < animals.length; i++) {
            if (random.nextBoolean()) {
                animals[i] = new Cat();
            } else {
                animals[i] = new Dog();
            }
        }
    }
}


