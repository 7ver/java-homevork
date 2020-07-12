package homework.homework8.СontractActConversion;

public abstract class Document {
    private final int number;
    private final String date;
    private final String[] goodsList;

    Document(int number, String date, String[] goodsList) {
        this.number = number;
        this.date = date;
        this.goodsList = goodsList;
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String[] getGoodsList() {
        return goodsList;
    }
}
