package homework.homework9.humans;

public class Teacher extends Human{
    public void swim() {
        System.out.println("Teacher swimming");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Oh, that was teacher!");
    }
}
