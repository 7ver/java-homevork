package homework.homework13;

public class Child {
    public  String giveFood(Food food) throws ChildDontLkeFood {
        if(food.getIsChildLikes()) {
            return "Yummy!";
        } else {
            throw new ChildDontLkeFood();
        }
    }
}
