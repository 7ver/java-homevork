package homework.homework7;

import java.util.ArrayList;
import java.util.Scanner;

public class WendingMachine {
    private final ArrayList<Drink> drinkList = new ArrayList<>();
    private int account = 0;

    WendingMachine() {
        this.addDrink(DrinkEnum.COCA_COLA, 42, 1);
        this.addDrink(DrinkEnum.FANTA, 21, 2);
        this.addDrink(DrinkEnum.SPRITE, 12, 3);

        System.out.println("You can buy drinks here!");
    }

    public void init() {
        System.out.println();
        this.showtMenuList();
        this.getUserAccount();
        this.buyOptionsHandler();
    }

    private void showtMenuList() {
        for(Drink drink : this.drinkList) {
            System.out.println(drink.getName() + ": " + drink.getPrice() + " rub,  id: " + drink.getId());
        }
        System.out.println();
    }

    private Drink identificateDrinkById(int id) {
        for(Drink drink : drinkList) {
            if (drink.getId() == id) {
                return drink;
            }
        }
        return null;
    }

    private int getUserDrinkOption() {
        return this.getUserInputInt("Enter drink id that you want to buy (Enter 0 to add more money to your account)");
    }

    private void getUserAccount() {
        int newAmount = this.getUserInputInt("Enter the amount of money you want to deposit into the account");

        this.account = this.account + newAmount;
    }

    private void buyOptionsHandler() {
        int drinkId = this.getUserDrinkOption();
        Drink userOption = this.identificateDrinkById(drinkId);

        if (drinkId == 0) {
            this.getUserAccount();
            this.buyOptionsHandler();
            return;
        }

        if (userOption == null) {
            System.out.println("You entered the wrong drink id. Try again");
            this.buyOptionsHandler();
            return;
        }

        this.buyStateHandler(userOption);
    }

    private void buyStateHandler(Drink drink) {
        int newAccount = this.account - drink.getPrice();

        if(newAccount >= 0) {
            System.out.println("You have successfully bought " + drink.getName() + "!");
            this.account = newAccount;
            this.buyOptionsHandler();
        } else {
            System.out.println("You dont have enough money on your account!");
            this.init();
        }
    }

    private int getUserInputInt(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    private  void addDrink(DrinkEnum name, int price, int id) {
        this.drinkList.add(new Drink(price, name, id));
    }
}
