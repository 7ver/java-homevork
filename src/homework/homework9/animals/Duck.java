package homework.homework9.animals;

import homework.homework9.interfaces.Fly;
import homework.homework9.interfaces.Run;
import homework.homework9.interfaces.Swim;

public class Duck extends Animal implements Fly, Run, Swim {
    public void fly() {
        System.out.println(getName() + " flying.");
    }

    public void run() {
        System.out.println(getName() + " running.");
    }

    public void swim() {
        System.out.println(getName() + " swimming.");
    }

    @Override
    public String getName() {
        return "Duck";
    }
}
