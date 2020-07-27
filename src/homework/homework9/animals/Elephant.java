package homework.homework9.animals;

import homework.homework9.interfaces.Run;

public class Elephant extends Animal implements Run {
    @Override
    public String getName() {
        return "Elephant";
    }

    public void run() {
        System.out.println(getName() + " running");
    }
}
