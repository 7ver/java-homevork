package homework.homework9.animals;

import homework.homework9.animals.Animal;
import homework.homework9.interfaces.IRun;

public class Elephant extends Animal implements IRun {
    @Override
    public String getName() {
        return "Elephant";
    }

    public void run() {
        System.out.println(getName() + " running");
    }
}
