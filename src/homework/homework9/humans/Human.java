package homework.homework9.humans;

import homework.homework9.interfaces.IRun;
import homework.homework9.interfaces.ISwim;

public abstract class Human implements IRun, ISwim {
    public void run() {
        System.out.println("Human running");
    }
}
