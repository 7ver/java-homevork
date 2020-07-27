package homework.homework9.humans;

import homework.homework9.interfaces.Run;
import homework.homework9.interfaces.Swim;

public abstract class Human implements Run, Swim {
    public void run() {
        System.out.println("Human running");
    }
}
