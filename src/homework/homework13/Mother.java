package homework.homework13;

public class Mother {
    private static Child child;
    public static void main(String[] args) {
        Mother.child = new Child();

        giveFoodToChild(Food.CARROT);
        System.out.println();

        giveFoodToChild(Food.ICE_CREAM);
        System.out.println();

        giveFoodToChild(Food.ONION);
        System.out.println();
    }

    private static void giveFoodToChild(Food food) {
        try {
            System.out.println(Mother.child.giveFood(food));
        } catch(ChildDontLkeFood error) {
            System.out.println(error.getMessage());
        } finally {
            System.out.println("Thank you... i think");
        }
    }
}


