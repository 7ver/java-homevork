package homework.homework8;

public class ClassWithCounter {
    private static int classCount = 0;

    ClassWithCounter() {
        ClassWithCounter.classCount++;
    }

    public int getClassCount() {
        return ClassWithCounter.classCount;
    }
}
