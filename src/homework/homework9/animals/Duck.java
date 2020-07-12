package homework.homework9.animals;

import homework.homework9.animals.Animal;
import homework.homework9.interfaces.IFly;
import homework.homework9.interfaces.IRun;
import homework.homework9.interfaces.ISwim;

public class Duck extends Animal implements IFly, IRun, ISwim {
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
