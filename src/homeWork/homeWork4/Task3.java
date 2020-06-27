package homeWork.homeWork4;

public class Task3 {
    public static void main(String[] args) {
        Task3.multiplicationTableFill();

        for(String row : Task3.multiplicationCountArray) {
            System.out.println(row);
        }
    }

    static String[] multiplicationCountArray = new String[9];

    private static void multiplicationTableFill() {
        for(int i = 1; i <= multiplicationCountArray.length; i++) {
            String row = "";
            for(int n = 1; n <= multiplicationCountArray.length; n++) {
                row = row + n + " x " + i + " = " + (i * n) + (i * n >= 10 ? " | " : "  | ");
            }
            Task3.multiplicationCountArray[i - 1] = row;
        }
    }
}
