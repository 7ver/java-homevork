package homework.homework13;

public enum Food {
    ICE_CREAM(true), CARROT(false),  ONION(false);
    private final boolean isChildLikes;

    Food(boolean isChildLikes) {
        this.isChildLikes = isChildLikes;
    }

    public boolean getIsChildLikes() {
        return isChildLikes;
    }
}
