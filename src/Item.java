public class Item {
    String itemName;
    String itemDescription;
    String itemType;
    double itemBonus;

    public Item(String name, String desc, String type, double bonus){
        this.itemName = name;
        this.itemDescription = desc;
        this.itemType = type;
        this.itemBonus = bonus;
    }

    public static void items(String[] args) {
        Item woodenSword = new Item("Wooden Sword", "A flimsy wooden sword.", "Strength",
                                    .05);
    }
}
