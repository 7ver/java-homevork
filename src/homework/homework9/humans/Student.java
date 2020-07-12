package homework.homework9.humans;

public class Student extends Human{
    public void swim() {
        System.out.println("Student swimming");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Oh, that was student!");
    }
}
