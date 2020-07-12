package homework.homework12;

public class ArrayOutOfBounds {
    public static void main(String[] args) {
        int[] array = new int[2];
        for(int i = 0; i < 5; i++) {
            array[i] = i;
        }
    }
}
