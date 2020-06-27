package homeWork.homeWork7;

public class Drink {
    private final int price;
    private final DrinkEnum name;
    private final int id;

    Drink(int price, DrinkEnum name, int id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public DrinkEnum getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
